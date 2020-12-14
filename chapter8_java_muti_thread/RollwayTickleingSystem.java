package chapter8_java_muti_thread;

import java.util.ArrayList;

public class RollwayTickleingSystem {
  int ticketNum = 200;

  public synchronized void sellOneTicket(int saleNum) {
    while (ticketNum > 0) {

      System.out.println("Saler" + saleNum + " is selling the ticket " + (201 - ticketNum));
      try {
        wait(1000);
      } catch (Exception e) {
      }
      ticketNum--;
    }
    System.out.println("Saler" + saleNum + " is sell out");
    try {
      wait(1000);
    } catch (Exception e) {
    }
  }

  public class salerTask implements Runnable{
    int Saler;
    public salerTask(int saler) {
      this.Saler = saler;
    }

    public void run() {
      sellOneTicket(Saler);
    }
  }

  public static void main(String[] args) {
    RollwayTickleingSystem r = new RollwayTickleingSystem();
    Thread man1 = new Thread(r.new salerTask(1), "man1");
    Thread man2 = new Thread(r.new salerTask(2), "man2");
    man1.start();
    man2.start();
    ArrayList<Thread> threadGroup = new ArrayList<Thread>();
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(r.new salerTask(i), "Thread" + i);
      threadGroup.add(t);
      t.start();
    }
    for (int i = 0; i < threadGroup.size(); i++) {
      Thread t = threadGroup.get(i);
      try {
        t.join();
      } catch (Exception e) {
        e.printStackTrace();
        ;
      }
    }
  }
}