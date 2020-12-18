package chapter11_Java_Network.ClassWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test_serve {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(8088);
    System.out.println("The server is starting...");
    Socket socket = server.accept();
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
      while (true) {
        String str = in.readLine();
        if (str != null && str.equals("Hello"))
          out.println("Hello, I'm serve.");
        else
          out.println("I don't know what you said.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      socket.close();
      server.close();
    }
  }
}
