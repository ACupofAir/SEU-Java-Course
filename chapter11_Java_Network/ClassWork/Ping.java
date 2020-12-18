package chapter11_Java_Network.ClassWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping {
  private static final int TIMEOUT = 5000;

  public void ping(InetAddress addr) {
    try {
      String hostName = addr.getHostName();
      while (true) {
        if (addr.isReachable(TIMEOUT)) {
          System.out.println("Reply from " + hostName + " within " + TIMEOUT + "ms.");
        }
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    byte[] ip = { (byte) 58, (byte) 192, (byte) 114, (byte) 215 };
    InetAddress addr;
    try {
      addr = InetAddress.getByAddress(ip);
      Ping a = new Ping();
      a.ping(addr);
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
