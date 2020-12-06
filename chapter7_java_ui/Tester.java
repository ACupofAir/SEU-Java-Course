package chapter7_java_ui;
import java.awt.BorderLayout; 
                                                         
import javax.swing.*;                                    
                                                         
public class Tester {                                    
  
  /** 
   * @param args
   */
  public static void main(String[] args) {               
    JFrame frame = new JFrame();                         
    JButton button = new JButton("Click me");            
    frame.getContentPane().add(BorderLayout.WEST, button);
    frame.setSize(300, 300);                             
    frame.setVisible(true);                              
  }                                                      
}                                                        
                                                         