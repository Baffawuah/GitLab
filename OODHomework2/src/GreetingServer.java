// File Name GreetingServer.java
import java.net.*;
import java.io.*;

public class GreetingServer extends Thread {
   private ServerSocket serverSocket;
   
   public GreetingServer(int port) throws IOException {
	  InetAddress addr = InetAddress.getByName("::1");
	   
      serverSocket = new ServerSocket(port, 50, addr);
      serverSocket.setSoTimeout(20000);
   }

   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client to connect to port. . . ." + 
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(server.getInputStream());
            
            System.out.println(in.readUTF());
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("The connection to this server has been successful!!" + server.getLocalSocketAddress()
               + "\nGoodbye and have a good day!!");
            server.close();
            
         }catch(SocketTimeoutException s) {
            System.out.println("The connection to the server has timed out! :(");
            break;
         }catch(IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String [] args) {
      //This is where you set the port number!
	   int port = 139; 
      try {
         Thread t = new GreetingServer(port);
         t.start();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}