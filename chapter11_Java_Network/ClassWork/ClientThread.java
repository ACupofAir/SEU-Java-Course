package chapter11_Java_Network.ClassWork;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientThread extends Thread {
  Socket client;
  BufferedReader in;
  PrintWriter out;

  public ClientThread() {
    try {
      InetAddress address = InetAddress.getLocalHost();
      client = new Socket(address, ServerDaemon.PORT);
      in = new BufferedReader(new InputStreamReader(client.getInputStream()));
      out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
