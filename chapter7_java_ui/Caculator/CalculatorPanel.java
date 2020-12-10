package chapter7_java_ui.Caculator;
                                           
import java.awt.*;                         
import java.awt.event.*;                   
import javax.swing.*;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;                      
                                           
class CalculatorPanel extends JPanel {     
  private static final long serialVersionUID = 1L;
                                            
  private JTextField display;               
  private JPanel panel;                     
  private double result;                    
  private String lastCommand;               
  private String Command;               
  private boolean start;                    
  double preData;               
  double curData;               
                                            
  public CalculatorPanel() {                
    setLayout(new BorderLayout());          
    result = 0;                             
    lastCommand = "=";                      
    start = true;                           
                                            
    display = new JTextField("0");          
    display.setSize(250, 25);              
    display.setEditable(false);                
    add(display, BorderLayout.NORTH);       
                                            
    ActionListener insert = new InsertAction();
    ActionListener command = new CommandAction();
                                                  
    panel = new JPanel();                         
    panel.setLayout(new GridLayout(5, 4, 5, 5));  
    addButton("7", insert);                       
    addButton("8", insert);                        
    addButton("9", insert);                        
    addButton("/", command);                       
                                                   
    addButton("4", insert);                         
    addButton("5", insert);                         
    addButton("6", insert);                         
    addButton("*", command);                        
                                                    
    addButton("1", insert);                         
    addButton("2", insert);                         
    addButton("3", insert);                         
    addButton("-", command);                        
                                                    
    addButton("0", insert);                         
    addButton(".", insert);                         
    addButton("=", command);                        
    addButton("+", command);                        
                                                    
    addButton("^2", command);                         
    addButton("√", command);                         
    addButton("Clr", command);                        
                                      
    add(panel, BorderLayout.CENTER);                
  }                                                 
                                                    
  private void addButton(String label, ActionListener listener) {
    JButton button = new JButton(label);                  
    button.addActionListener(listener);                   
    panel.add(button);                                    
  }                                                       
                                                          
  private class InsertAction implements ActionListener {  
    public void actionPerformed(ActionEvent event) {      
      String input = event.getActionCommand();                                   
      if (start) {                                                               
        display.setText("");                                                     
        start = false;                                                           
      }                                                                          
      display.setText(display.getText() + input);                                
    }                                                                            
  }                                                                              
                                                                                 
  private class CommandAction implements ActionListener {                        
    public void actionPerformed(ActionEvent event) {
      Command = event.getActionCommand();
      if (Command.equals("Clr")) {
        display.setText("");
        start = false;   
      } else {              
                                            
        if (start) {                        
          if (Command.equals("-")) {        
            display.setText(Command);       
            start = false;                  
          } else                            
            lastCommand = Command;          
        } else {                            
          double data = Double.parseDouble(display.getText());
          if (Command.equals("^2")) {       
            result = data * data;           
            display.setText("" + result);   
          } else if (Command.equals("√")) { 
            result = Math.sqrt(data);           
            display.setText("" + result);   
          } else {                          
            calculate(data);                
            lastCommand = Command;          
            start = true;                   
          }                                 
        }                                   
      }                                     
    }                                       
  }                                         
                                                                                 
  public void calculate(double x) {                                              
    if (lastCommand.equals("+"))                                                 
      result += x;                                                               
    else if (lastCommand.equals("-"))                                            
      result -= x;                                                               
    else if (lastCommand.equals("*"))                                            
      result *= x;                                                               
    else if (lastCommand.equals("/"))                                            
      result /= x;                                                               
    else if (lastCommand.equals("="))                                            
      result = x;                                                                
    display.setText("" + result);                                                
  }                                                                              
}                                                                                
                                                                                 