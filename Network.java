import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.*;

/**
 * Write a description of class Network here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Network extends Thread
{
    public String IP;
    public int Port;
    
    public Socket connection;

    public PrintStream outStream;
    public Scanner inStream;

    public boolean gameStarted = false;

    public Date syncTimer;
    
    public static boolean okayToRun = false;
    
    private BlockingQueue<String> messagesToSend = new LinkedBlockingQueue<String>();
    private BlockingQueue<String> messagesReceived = new LinkedBlockingQueue<String>();
    
    @Override
    public void run() {
        
       while(connection == null && okayToRun) {
            try {
                connection = new Socket(IP, Port);
                outStream = new PrintStream(connection.getOutputStream());
                inStream = new Scanner(connection.getInputStream());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }
        }
    
       Thread t = new Thread(new Runnable() {
           @Override
           public void run() {
                //get all new messages and put in messagesReceived
                while (Network.okayToRun) {
                    String x = inStream.nextLine();
                    messagesReceived.add(x); 
                    System.out.println(x);
                }
           }
        
       });
        
       t.start();
        
       while (okayToRun) {
            //send all pending messages
            if(!messagesToSend.isEmpty())
            {
                outStream.println(messagesToSend.remove());
            }
       }
    }

    public  synchronized void writeMsg(String s) {
        outStream.println(s);
    }

    public synchronized String readMessage() {
        return inStream.nextLine();
    }
    
    public synchronized boolean addMessage(String s) {
        return messagesToSend.offer(s);
    }
    
    public synchronized String getMessage() {
        if(messagesReceived.isEmpty())
        return null;
        
        return messagesReceived.remove();
    }
    
    public synchronized boolean hasMessage() {
        return !messagesReceived.isEmpty();
       }
       

}
