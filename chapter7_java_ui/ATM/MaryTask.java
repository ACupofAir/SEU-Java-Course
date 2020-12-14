package chapter7_java_ui.ATM;
                                                                 
public class MaryTask implements Runnable {
  ATM o;           
                   
  public MaryTask(ATM account) {                                  
    o = account;                                                 
  }                
                   
  public void run() {
    o.deposit(1500);
    o.withdraw(100);
  }                 
}                   
                                                                 