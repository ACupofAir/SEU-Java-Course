package chapter3;
                                        
public class ClassWork {       
  
  /** 
   * @return int
   */
  public int test() {         
    try {                      
      System.out.println("try block");
      int i = 1/0;    
      return 1;                  
    }                 
    catch(Exception e) {
      System.out.println("catch block");
      return 2;       
    }                                  
    finally {                          
      //finally pro than return        
      System.out.println("finally block");
    }                                  
  }                                    
                                       
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    ClassWork a = new ClassWork();      
    System.out.println(a.test());
  }                                     
                                          
}                                         
                                          