package chapter7_java_ui.ATM;
                                          
public class TomTask implements Runnable {
  ATM o;                                  
                                          
  public TomTask(ATM account) {           
    o = account;                          
  }                                       
                                          
  public void run() {                     
    o.withdraw(100);                      
  }                                       
}                                         
                                          