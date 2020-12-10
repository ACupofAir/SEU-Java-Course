package chapter8_java_muti_thread;
                                                                               
public class MyTask implements Runnable {                                      
  public void run() {                                                          
    while(true) {                                                               
      System.out.println(Thread.currentThread().getName() + " is doing MyTask");
      try {                                                                     
        Thread.sleep(1000);                                                     
      } catch (Exception e) {                                                   
        e.printStackTrace();                                                    
      }                                                                         
    }                                                                           
  }                                                                             
                                                                                
  public static void main(String[] args) {                                      
    Thread thread = new Thread(new MyTask(), "My Thread");                      
    thread.start();                                                             
  }                                                                             
}                                                                               
                                                                                