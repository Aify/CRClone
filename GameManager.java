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
    
    static final String SERVER_IP = "50.64.164.103";
    static final int PORT = 9876;
    
    private GameManagerState state;
    
    private Network networkHandler;
    
    public static Actor lastSelectedCard = null;
    public static Card lastSelected = null;
    
    
    public GameManager()
    {
        super();
        
        Network.okayToRun = false;
   
        state = GameManagerState.UNCONNECTED;
    }
    
    /**
     * Act - setup connection and synchronize game state here, as well as spawning cards
     */
    public void act() 
    {
        //deal with the card spawning
        handleCardSpawn();
        

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
     * handleCardSpawn - check if we need to spawn a card and do so
     */
    private void handleCardSpawn()
    {
        MyWorld w = getWorldOfType(MyWorld.class);
        
        if(Greenfoot.mousePressed(w) && lastSelected != null)
        {
                       
            if(w.playCard(lastSelected, Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY()))
            {
                lastSelected = null;
                w.removeObject(lastSelectedCard);
                lastSelectedCard = null;
            }
            else
            {
                //System.out.println("Cannot afford!");
            }
            
        }
    }
    
    /**
     * attemptConnection tries to connect to the server
     */
    private void attemptConnection()
    {
        //connect to the server and switch state when done
        if(networkHandler == null)
        {
            networkHandler = new Network();
            networkHandler.IP = SERVER_IP;
            networkHandler.Port = PORT;
            Network.okayToRun = true;
            networkHandler.start();
        }
        

             if(networkHandler.connection != null && networkHandler.connection.isConnected()) {
                 state = GameManagerState.WAITING;
               }
               else
               {
                   //System.out.println("Failed to connect to server!");
                }

    }
    
    /**
     * syncServerState checks if the server is started yet
     */    
    private void syncServerState()
    {
        //poll the server state and check own stream for message
        networkHandler.addMessage("5{CHECK");
        if(networkHandler.hasMessage()) {
            String s = networkHandler.readMessage();
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
            networkHandler.addMessage(outStr);
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
        while(networkHandler.hasMessage()) {
            try {
                String s = networkHandler.readMessage();
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
