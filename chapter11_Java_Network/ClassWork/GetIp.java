package chapter11_Java_Network.ClassWork;

import java.net.InetAddress;
import java.util.ArrayList;

public class GetIp {

  public ArrayList<String> GetAllIp() {
    ArrayList<String> allIP = new ArrayList<String>();
    try{
      String hostName = InetAddress.getLocalHost().getHostName();
      if(hostName.length() > 0) {
        InetAddress[] addresses = InetAddress.getAllByName(hostName);
        for(int i = 0; i < addresses.length; i++) {
          allIP.add(addresses[i].getHostAddress().toString());
        }
      }
      return allIP;
    } catch (Exception e) {
      e.printStackTrace();
      return allIP;
    }
  }
  public static void main(String[] args) {
    GetIp a = new GetIp();
    ArrayList<String> temp = a.GetAllIp();
    System.out.println(temp);
  }

}
