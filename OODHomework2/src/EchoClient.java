import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {
    	
    	//This is where the Server's IP goes
        String serverHostname = new String ("127.0.0.1");
        
        //This is if enter a command line parameter whether or not it will use the 'default' IP of the device.

        if (args.length > 0)
           serverHostname = args[0];
        System.out.println ("Attemping to connect the specified Host" +
		serverHostname + " on port 10007.");

        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket(serverHostname, 10007);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                                        echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + serverHostname);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                               + "the connection to: " + serverHostname);
            System.exit(1);
        }

        
        //Simple echo code to be generated when the server talks to the client
	BufferedReader stdIn = new BufferedReader(
                                   new InputStreamReader(System.in));
	String userInput;

        System.out.print ("input: ");
	while ((userInput = stdIn.readLine()) != null) {
	    out.println(userInput);
	    System.out.println("echo: " + in.readLine());
            System.out.print ("input: ");
	}

	out.close();
	in.close();
	stdIn.close();
	echoSocket.close();
    }
}
