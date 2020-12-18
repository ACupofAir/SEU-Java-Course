package chapter11_Java_Network.ClassWork;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
  public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
    Socket socket = new Socket("localhost", 8088);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
    out.println("Hello");
    Thread.sleep(1000);
    out.println("What's the day today?");
    socket.close();
  }

}