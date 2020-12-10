package chapter7_java_ui.Caculator;
                                                               
import javax.swing.*;                                          
import java.awt.event.*;
                                                                
public class CalculatorFrame extends JFrame {                   
  private JMenuBar mb;                                
  private JMenu m;                                    
  private JMenu menu_Edit;                                            
  private JButton btn_about;                                          
                                                                      
  public CalculatorFrame() {                                          
    mb = new JMenuBar();                                              
    m = new JMenu("Help");                                            
    menu_Edit = new JMenu("Edit");                                    
    btn_about = new JButton("About");                                 
    btn_about.addActionListener(new ActionListener() {                
      public void actionPerformed(ActionEvent event) {                
        JOptionPane.showMessageDialog(btn_about, "71119138\nWangJun");
      }                                                               
    });                                                               
    m.add(btn_about);                                                 
    mb.add(menu_Edit);                                                
    mb.add(m);                                                        
    this.setJMenuBar(mb);                                             
    setTitle("Calculator");                                           
    CalculatorPanel panel = new CalculatorPanel();                    
    add(panel);                                                       
    pack();                                                           
  }                                                                   
                                                                      
  public static void main(String[] args) {                            
    CalculatorFrame frame = new CalculatorFrame();                    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    frame.setSize(250,250);                                           
    frame.setVisible(true);                                           
  }                                                                   
}                                                                     
                                                                      