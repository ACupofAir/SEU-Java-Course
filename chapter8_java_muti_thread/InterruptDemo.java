package chapter8_java_muti_thread;
                                                    
public class InterruptDemo extends Thread {         
  public void run() {                               
    System.out.println("Thread started.");          
    while(!interrupted()) {                          
        System.out.println("Thread is running.");    
      }                                              
      System.out.println("Thread interruped and ended");
    }                                                
                                                     
  public static void main(String[] args) {           
      Thread t = new InterruptDemo();                
      t.start();                                     
    try{                                             
      Thread.sleep(2000);                            
      t.interrupt();                                 
    } catch(Exception e) {                           
      t.interrupt();                                 
    }                                                
  }                                                  
}                                                    
                                                     