package chapter8_java_muti_thread;

import java.util.ArrayList;

public class MyTask implements Runnable {
  public synchronized void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name + "started.");
    try {
      wait(1000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(name + "ended.");
  }

  public static void main(String[] args) {
    long begin = System.currentTimeMillis();
    MyTask task = new MyTask();
    ArrayList<Thread> threadGroup = new ArrayList<Thread>();
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(task, "Thread" + i);
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
    System.out.println("Time: " + (System.currentTimeMillis() - begin));
  }
}
