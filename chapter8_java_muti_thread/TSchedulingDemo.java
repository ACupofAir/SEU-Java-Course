package chapter8_java_muti_thread;
                                                                        
public class TSchedulingDemo implements Runnable {                      
  public void run() {                                                   
    for(int i = 0; i < 30; i++) {                                   
      String name = Thread.currentThread().getName();
      System.out.println(name + " is running");      
    }                                                
  }                                                                     
                                                     
  public static void main(String[] args) {           
    Runnable myTask = new TSchedulingDemo();         
    Thread t1 = new Thread(myTask);                  
    t1.setName("Thread1");                           
    t1.setPriority(10);                              
    Thread t2 = new Thread(myTask);                  
    t2.setName("Thread2");                           
    t2.setPriority(1);                               
    t1.start();                                      
    t2.start();                                      
  }                                                  
                                                     
                                                                        
}                                                                       
                                                                        