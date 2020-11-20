package chapter2;
                  
public class Son extends Father{
  public String name = "son";
                  
  public void print() {
    System.out.println(name);
  }                        
                           
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Father person = new Son();
    person.showName();     
  }                           
                                          
}                                         
                                          