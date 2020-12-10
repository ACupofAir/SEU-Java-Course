package chapter8_java_muti_thread;
                                                                         
public class TwoThreadsDemo implements Runnable {                        
  public void run() {                                                    
    for(int i = 0; i < 10; i++) {                                        
      String threadName = Thread.currentThread().getName();              
      System.out.println(threadName + " is running");                    
    }                                                                    
  }                                                                      
                                                                         
  public static void main(String[] args) {                               
    System.out.println(Thread.currentThread().getName() + " is running");
    Runnable twoThreadsDemo = new TwoThreadsDemo();                      
    Thread thread1 = new Thread(twoThreadsDemo);                         
    thread1.setName("Thread1");                                          
    Thread thread2 = new Thread(twoThreadsDemo);                         
    thread2.setName("Thread2");                                          
    thread1.start();thread2.start();                                     
    System.out.println(Thread.currentThread().getName() + " is running");
  }                                                                      
                                                                         
}                                                                        
                                                                         