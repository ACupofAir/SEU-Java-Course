package chapter8_java_muti_thread;
                                                                    
public class MyThread extends Thread {                              
  public void run() {                                               
    while(true) {                                                   
      System.out.println(this.getName() + " is doing its own task");
      try {                                                         
        Thread.sleep(1000);                                         
      } catch (Exception e) {                                       
        e.printStackTrace();                                        
      }                                                             
    }                                                               
  }                                                                 
                                                                    
  public static void main(String[] args) {                          
    MyThread myThread = new MyThread();                             
    myThread.setName("Hello");                                      
    myThread.start();                                               
                                                                    
  }                                                                 
}                                                                   
                                                                    