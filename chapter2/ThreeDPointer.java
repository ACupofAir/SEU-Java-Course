package chapter2;
                                  
public class ThreeDPointer extends TwoDPointer {
  public int z;                  
  public ThreeDPointer() {        
    super();                      
    System.out.println("Put z");  
    z = sc.nextInt();             
  }                               
                                  
  public double distance() {      
    return Math.sqrt(x*x+y*y+z*z);
  }                               
                            
  public int projection() { 
    return x*y*z;           
  }                         
                                              
}                                             
                                              