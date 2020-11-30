package chapter7_java_ui;
                                      
import javax.swing.*;                 
import java.awt.*;                    
import java.awt.event.*;
                                            
public class TextSelectionPanel extends JPanel {
  JTextArea textArea;                        
  JTextField textField;                                                          
  JButton copyToButton;                                                          
                                                                                 
  public TextSelectionPanel() {                                                  
    this.setLayout(new FlowLayout());                                            
    this.setName("inner panel");                                                 
    textArea = new JTextArea(5, 20);                                             
    textField = new JTextField(20);                                              
    textField.setEditable(false);                                                
    copyToButton = new JButton("Copy To");                                       
    copyToButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event) {                           
        textField.setText("");                                                   
        String selected = textArea.getSelectedText();                            
        textField.setText(selected);                                             
      }                                                                          
    });                                                                          
                                                                                 
    this.add(textArea);                                                          
    this.add(textField);                                                         
    this.add(copyToButton);                                                      
  }                                                                              
}                                                                                
                                                                                 