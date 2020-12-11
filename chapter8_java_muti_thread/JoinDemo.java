package chapter8_java_muti_thread;
             
public class JoinDemo extends Thread {
  public void run() {
    String name = Thread.currentThread().getName();
    System.out.println("Thread started.");
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread is running.");
    }         
    System.out.println("Thread ended.");
  }           
              
  public static void main(String[] args) {
    System.out.println("Main started.");
    Thread t = new JoinDemo();
    t.start();
    try {     
      t.join();
    } catch (Exception e) {
    }         
    System.out.println("Main ended.");
  }           
}             
              