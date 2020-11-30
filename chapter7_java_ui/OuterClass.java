package chapter7_java_ui;
                                                         
public class OuterClass {                                
  int a = 5;                                             
  static int b = 6;                                      
  private void show() {                                  
    class InnerClass {                    
      void print() {                      
        System.out.println("Inner Class");
      }                                   
      void print1() {                     
        System.out.println("Inner Class 1");
      }                                   
    }                                                    
                                          
    InnerClass in = new InnerClass();     
    in.print();                           
  }                                                      
                                                         
                                                         
  public static void main(String[] args) {               
    OuterClass a = new OuterClass();      
    a.show();                             
  }                                                      
                                                         
}                                                        
                                                         