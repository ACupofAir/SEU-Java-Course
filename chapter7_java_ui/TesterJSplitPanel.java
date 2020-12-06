package chapter7_java_ui;
                                                                  
import javax.swing.*;    
import org.graalvm.compiler.java.JsrNotSupportedBailout;
import java.awt.*;   
                                                                                             
public class TesterJSplitPanel {                                                             
                                                                                             
  
  /** 
   * @param args
   */
  public static void main(String[] args) {                                                   
    JFrame jFrame = new JFrame("JSpiltPanel example");                                       
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                   
    Container cp = jFrame.getContentPane();                                                  
    String[] stringList = {"One", "Two", "Three", "Four", "Five"};                           
    JList<String> list = new JList<String>(stringList);                                      
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, new JTextArea());
    splitPane.setDividerLocation(80);
    cp.add(splitPane);           
    jFrame.setSize(200,200);     
    jFrame.setVisible(true);     
  }                                                                                          
                                         
                                                                                             
}                                                                                            
                                                                                             