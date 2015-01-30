package app;

import java.net.Socket;
import java.io.PrintWriter;
public class Client
{
	private static String hostName = "localHost";
	private static int portNumber = 6358;
	private static Socket socket;
	private static PrintWriter printWriter;
	private static String sentence = "This is an example of a sentence.";
	public static void main(String[] args)
	{
		try
		{
			socket = new Socket(hostName,portNumber);
			
			printWriter = new PrintWriter(socket.getOutputStream(),true);
			printWriter.println("This is the example: "+sentence);
			printWriter.println("This shows how many signs there are in "
					+ "the sentence: "+ sentence.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
