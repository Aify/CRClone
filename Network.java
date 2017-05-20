import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

/**
 * Write a description of class Network here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Network extends Thread
{
	public Socket connection;

	public PrintStream outStream;
	public Scanner inStream;

	public boolean gameStarted = false;

	public Date syncTimer;

	@Override
	public void run() {
		// connect to server
		// TODO: CONNECT TO SERVER
		
		try {
			connection = new Socket("70.79.124.240", 9876);
			outStream = new PrintStream(connection.getOutputStream());
			inStream = new Scanner(connection.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// write a sync message
		outStream.println("3{SYNC");
		syncTimer = new Date();

		while (true) {
			if (!gameStarted) {
				if (new Date().getTime() - syncTimer.getTime() > 15000) {
					syncTimer = new Date();
					outStream.println("3{SYNC");

					String reply = inStream.nextLine();
					String[] replyArr = reply.split("{");
					if (replyArr[1].equals("SYNC")) {
						// do nothing, this is normal.
					} else if (replyArr[1].equals("START")) {
						gameStarted = true;
					}
				} 
			} else {
				// game loop
				// read messages and update gamestate
				// note that writing messages is handled from the user input end. 
			}
		}
	}

	public  synchronized void writeMsg(String s) {
		outStream.println(s);
	}

	public synchronized String readMessage() {
		return inStream.nextLine();
	}
}
