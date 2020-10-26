package chapter2;
                             
import java.util.Scanner;    
                             
public class TwoDPointer {   
  public Scanner sc;        
  public int x, y;                 
                                     
  public double distance() {         
    return Math.sqrt(x*x+y*y);       
  }                                  
                                     
  public int projection() {          
    return x*y;                      
  }                                  
                                     
  public TwoDPointer() {             
    this.sc = new Scanner(System.in);
    System.out.println("Put x");     
    this.x = this.sc.nextInt();         
    System.out.println("Put y");     
    this.y = this.sc.nextInt();         
  }                                  
                                     
}                                    
                                     
                                     