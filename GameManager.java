import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
import java.net.*;

/**
 * GameManager manages synchronization of game state across the network
 * 
 * @author XCVG
 * @version 1
 */
public class GameManager extends Actor
{
    //this enum is used for defining states this object can be in- ask Hank what a state machine is if you're curious
    private enum GameManagerState
    {
        UNCONNECTED, WAITING, STARTED;
    }
    
    static final String SERVER_IP = "127.0.0.1";
    static final int PORT = 9876;
    
    private GameManagerState state;
    private Socket client;
    private Scanner inStream;
    private PrintStream outStream;
    
    public GameManager()
    {
        super();
        
        state = GameManagerState.UNCONNECTED;
    }
    
    /**
     * Act - setup connection and synchronize game state here
     */
    public void act() 
    {
        switch(state)
        {
            case UNCONNECTED:
                attemptConnection();
                break;
            case WAITING:
                syncServerState();
                break;
            case STARTED:
                syncMySpawnedUnits();
                syncOtherSpawnedUnits();
                break;

        }
    }
    
    /**
     * attemptConnection tries to connect to the server
     */
    private void attemptConnection()
    {
        //connect to the server and switch state when done
        try {
             System.out.println("Connecting to " + SERVER_IP + " on port " + PORT);
             client = new Socket(SERVER_IP, PORT);
             inStream = new Scanner(client.getInputStream());
             outStream = new PrintStream(client.getOutputStream());
             if(client.isConnected()) {
                 state = GameManagerState.WAITING;
               }
          } catch(ConnectException e) {
              System.out.println("Failed to connect to server!");
          } catch(Exception e) {
             e.printStackTrace();
          }
    }
    
    /**
     * syncServerState checks if the server is started yet
     */    
    private void syncServerState()
    {
        //poll the server state and check own stream for message
        outStream.println("5{CHECK");
        if(inStream.hasNextLine()) {
            String s = inStream.nextLine();
            //System.out.println(s);
            String[] sParts = s.split("\\{");
            if(sParts[0] == "5" && Boolean.valueOf(sParts[1])) {
                state = GameManagerState.STARTED;
            }
        }        
    }
    
    /**
     * syncMySpawnedUnits sends "unit spawned" messages to the server from this client's spawn list
     */
    private void syncMySpawnedUnits()
    {
        MyWorld w = getWorldOfType(MyWorld.class);
        
        for(SpawnedCardData scd : w.newCards) {
            String outStr = "4{" + scd.toFormattedString();
            outStream.println(outStr);
        }
        
        w.newCards.clear();
    }
    
    /**
     * syncOtherSpawnedUnits gets "unit spawned" messages from the server and applies it here
     */
    private void syncOtherSpawnedUnits()
    {
        MyWorld w = getWorldOfType(MyWorld.class);
        
        //get a list of spawned units/cards and recreate them here
        while(inStream.hasNextLine()) {
            try {
                String s = inStream.nextLine();
                String[] sParts = s.split("\\{");
                if(sParts[0] == "4") {
                    String[] args = sParts[1].split(",");
                    String c = args[0];
                    int x = Integer.parseInt(args[1]);
                    int y = Integer.parseInt(args[2]);
                    w.playCard((Card)Class.forName(c).getConstructor().newInstance(),x,y,true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
