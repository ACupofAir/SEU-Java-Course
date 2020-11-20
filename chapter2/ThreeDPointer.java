package chapter2;
                                  
public class ThreeDPointer extends TwoDPointer {
  public int z;                  
  public ThreeDPointer() {        
    super();                      
    System.out.println("Put z");  
    z = sc.nextInt();             
  }                               
                                  
  
  /** 
   * @return double
   */
  public double distance() {      
    return Math.sqrt(x*x+y*y+z*z);
  }                               
                            
  
  /** 
   * @return int
   */
  public int projection() { 
    return x*y*z;           
  }                         
                                              
}                                             
                                              