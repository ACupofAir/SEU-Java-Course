package chapter7_java_ui;
                                                                                                                                                        
import javax.swing.*;                                                                                                                                   
import java.awt.*;                                                                                                                                      
                                                                                                                                                        
public class TesterJScrollPanel {                                                                                                                       
                                                                                                                                                        
  
  /** 
   * @param args
   */
  public static void main(String[] args) {                                                                                                              
    JFrame jFrame = new JFrame("JScrollPanel");                                                                                                         
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                                                              
                                                                                                                                                        
    ImageIcon icon = new ImageIcon("C:\\Users\\offnet\\Pictures\\WallPapers\\windows-10-microsoft-windows-colorful-black-background-2560x1440-1552.jpg");
    icon.setImage(icon.getImage().getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT));
    JLabel label = new JLabel();                                           
    label.setHorizontalAlignment(0);                                       
    label.setIcon(icon);                                                   
                                                                           
    JScrollPane sp = new JScrollPane(label);                               
    sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
    sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                           
   jFrame.setSize(500,500);
   jFrame.add(sp);       
   jFrame.setVisible(true);
  }                                                                                                                                                     
                                                                                                                                                        
}                                                                                                                                                       
                                                                                                                                                        