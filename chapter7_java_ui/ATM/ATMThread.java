package chapter7_java_ui.ATM;
                                         
public class ATMThread {                 
  ATM o;                                 
  Thread Tom;                              
  Thread Mary;                             
                                           
  public ATMThread() {                     
    o = new ATM();                             
    Thread Tom = new Thread(new TomTask(o), "Tom");
    Thread Mary = new Thread(new MaryTask(o), "Mary");
    Tom.start();                               
    Mary.start();                              
  }                                                   
                                               
  public static void main(String[] args) {     
    ATMThread thread = new ATMThread();        
  }                                            
                                                      
}                                                     
                                                      