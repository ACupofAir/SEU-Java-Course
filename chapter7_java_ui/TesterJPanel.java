package chapter7_java_ui;
                                               
import javax.swing.*;                          
import java.awt.*;                             
                                                       
public class TesterJPanel {                            
                                                       
  public static void main(String[] args) {             
    JFrame jFrame = new JFrame("JPanel example");       
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = jFrame.getContentPane();           
    cp.setLayout(new FlowLayout());                     
    JPanel p1 = new JPanel();                           
    p1.setBackground(Color.green);                                 
    cp.add(p1);
    p1.add(new JTextField("Contents"));                 
    p1.add(new JButton("Button"));                      
    jFrame.setSize(300,300);                            
    jFrame.setVisible(true);                            
  }                                                      
                                                         
}                                                        
                                                         