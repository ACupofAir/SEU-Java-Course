package chapter7_java_ui;
                                             
import javax.swing.*;                        
import java.awt.*;                           
                                                         
public class TextSelectionFrame extends JFrame {         
                                                         
  public TextSelectionFrame() {                          
    TextSelectionPanel panel = new TextSelectionPanel(); 
    this.setTitle("Copy Selected Text");                 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.add(panel);                                     
    this.setSize(600,200);                               
  }                                                      
                                                         
  
  /** 
   * @param args
   */
  public static void main(String[] args) {               
    TextSelectionFrame tFrame = new TextSelectionFrame();
    tFrame.setVisible(true);                             
  }                                                      
                                                         
}                                                        
                                                         