package chapter7_java_ui;
                                                                                        
import javax.swing.*;                                                                   
import java.awt.*;                                                                      
import java.awt.event.*;                                                                      
                                                                                        
public class QuizPanel extends JPanel {                                                 
  JLabel questionLabel;                                                                 
  JRadioButton a,b,c,d;                                                                 
  ButtonGroup quizGroup;                                                                
  JButton submitBtn;                                                                    
                                                                                        
  public QuizPanel() {                                         
    questionLabel = new JLabel("To make the JVM's MEM fixed 500M, which one is right?");
    a = new JRadioButton("-Xms500m -Xmx500m");              
    b = new JRadioButton("-Xms 500m -Xmx 500m");            
    c = new JRadioButton("-Xms-500m -Xmx-500m");            
    d = new JRadioButton("-Xms:500m -Xmx:500m");                                                                         
    quizGroup = new ButtonGroup();                                                                                       
    quizGroup.add(a);                                                                                                    
    quizGroup.add(b);                                                                                                    
    quizGroup.add(c);                                                                                                       
    quizGroup.add(d);                                                                                                        
    submitBtn = new JButton("Submit");                                                                                       
    submitBtn.setSize(50,50);                                                                                                
    submitBtn.addActionListener(new ActionListener() {                                                                       
      public void actionPerformed(ActionEvent event) {                                                                       
        // if (a.isSelected()) {                                                                                             
        //   JOptionPane.showMessageDialog(submitBtn, "True");                                                               
        // } else {                                                                                                          
        //   JOptionPane.showMessageDialog(submitBtn, "Wrong");                                                              
        // }                                                                                                                 
        if (quizGroup.getSelection().getActionCommand().equals("-Xms500m -Xmx500m")) {
          JOptionPane.showMessageDialog(submitBtn, "True");                      
        } else {                                                                 
          JOptionPane.showMessageDialog(submitBtn, "Wrong");                     
        }                                                                        
      }                                                                                                                      
    });                                                                                                                      
    this.setLayout(new GridLayout(6,1));                                                                                     
    this.add(questionLabel);                                                                                                 
    this.add(a);                                                                                                             
    this.add(b);                                                                                                             
    this.add(c);                                                                                                             
    this.add(d);                                                                                                             
    this.add(submitBtn);                                                                                                     
  }                                                                                                                          
}                                                                                                                            
                                                                                                                             