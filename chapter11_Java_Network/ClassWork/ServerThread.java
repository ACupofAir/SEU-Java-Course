package chapter11_Java_Network.ClassWork;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
 Socket socket;
 BufferedReader in;
 PrintWriter out;

 public ServerThread(Socket socket) throws IOException {
   ServerDaemon.CUREENT_THREADS++;
   this.socket = socket;
   in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
   out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())), true);
 }

 public void run() {
   try {
     while (true) {
       String str = in.readLine();
       if (str != null) {
         if (str.equals("bye")) {
           break;
         } else {
           String greeting = "Hello" + str + ", I am Server.";
           out.println(greeting);
         }
       }
     }
   } catch (Exception e) {
     e.printStackTrace();
   } finally {
     try{
       socket.close();
       ServerDaemon.CUREENT_THREADS--;
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
 }
}
