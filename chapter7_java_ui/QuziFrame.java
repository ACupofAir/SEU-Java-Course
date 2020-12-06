package chapter7_java_ui;
                       
import javax.swing.JFrame;                
                                          
public class QuziFrame extends JFrame {   
  public QuziFrame() {                    
    QuizPanel panel = new QuizPanel();       
    this.add(panel);                         
    this.setTitle("Quiz");                   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,200);                   
  }                                                   
  
  /** 
   * @param args
   */
  public static void main(String[] args) {   
    QuziFrame frame = new QuziFrame();       
    frame.setVisible(true);                  
  }                                          
}                                                     
                                                                  