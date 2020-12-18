package chapter11_Java_Network.ClassWork;

import java.net.ServerSocket;

public class ServerDaemon {
  public static final int PORT = 8080;
  private static final int MAX_THREADS = 10;
  public static int CUREENT_THREADS = 0;
  ServerSocket server;

  public ServerDaemon() {
    System.out.println("Server started.");
    try {
      server = new ServerSocket(PORT);
      while (true) {
        if (CUREENT_THREADS < MAX_THREADS) {
          ServerThread thread = new ServerThread(server.accept());
          thread.start();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try{
        server.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}
