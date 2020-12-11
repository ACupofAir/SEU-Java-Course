package chapter7_java_ui.ATM;
                                                                                                  
public class ATM {                                                                                
             
  String accountName = "Tom and Mary";
  double balance = 0;                                                                               
                                                                                                    
  public synchronized void withdraw(double amount) {                                                
    while (balance < amount) {                                                                      
      System.out.println("No enough balance, " + Thread.currentThread().getName() + "has to wait.");
      try {                                                                                         
        wait(1000);                                                                                 
      } catch (Exception e) {                                                                       
      }                                                                                             
    }                                                                                               
    System.out.println("Enough balance now, " + Thread.currentThread().getName() + "can withdraw now.");
    balance -= amount;                                                                             
  }                                                                                                 
                                                                                                   
  public void deposit(double amount) {                                                             
    System.out.println(Thread.currentThread().getName() + " is depositing.");                      
    balance += amount;                                                                             
  }                                                                                                
}                                                                                                   
                                                                                                    