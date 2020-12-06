package chapter7_java_ui;
                                    
import javax.swing.JFrame;                                            
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;                                         
                                                                      
public class TextDemo {                                               
  JFrame frame;                                                       
  JTextArea textArea;                                                 
                                                                      
  TextDemo() {                                                        
    frame = new JFrame("Hello World");                                
    textArea = new JTextArea();                                       
    textArea.getDocument().addDocumentListener(new TextChangeListener());
    frame.add(textArea);                                              
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    frame.setSize(500,500);                                           
    frame.setVisible(true);                                           
  }                                                                   
                                                                
  private class TextChangeListener implements DocumentListener {
    boolean changed = false;                    
    public void changedUpdate(DocumentEvent e) {
      if(!changed) {                         
        frame.setTitle("*" + frame.getTitle());
        changed = true;
      }                                      
    }                                        
  }                                             
}                                                                     
                                                                      