package chapter7_java_ui;
                        
import java.awt.*;                 
import java.awt.event.*;                          
import java.io.*;                  
                                   
import javax.management.RuntimeErrorException;
import javax.swing.*;              
                                                                 
                                                                 
public class TextEditor {                                        
  private JFrame f;                                              
  private JScrollPane jp;                                        
  private JMenuBar mb;                                                     
  private JMenu m;                                                         
  private JTextArea ta;                                                    
  private JMenuItem openItem, saveItem, closeItem;                         
  private FileDialog openDia, saveDia;                                     
  private File file;                                                       
                                                                           
  public TextEditor() {                                                    
    f = new JFrame("Text Editor");                                         
    f.setBounds(300,100,650,600);                                          
    f.setVisible(true);                                                    
    mb = new JMenuBar();                                                   
    ta = new JTextArea();                                                  
    jp = new JScrollPane(ta);                                              
    jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
    jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    f.add(jp);                                                             
    m = new JMenu("File");                                                 
    openItem = new JMenuItem("Open");                                      
    saveItem = new JMenuItem("Save");                                      
    closeItem = new JMenuItem("Close");                                    
    m.add(openItem);                                                       
    m.add(saveItem);                                                       
    m.add(closeItem);                                                      
    mb.add(m);                                                             
    openDia = new FileDialog(f, "Open...", FileDialog.LOAD);               
    saveDia = new FileDialog(f, "Save...", FileDialog.SAVE);               
    f.setJMenuBar(mb);                                                     
    addEvent();                                                            
    f.setVisible(true);                                                    
  }                                                                        
                                                                           
  private void addEvent() {                                                
    openItem.addActionListener(new ActionListener() {                   
      public void  actionPerformed(ActionEvent e) {                        
        openDia.setVisible(true);                                          
        String dirPath = openDia.getDirectory();                           
        String fileName = openDia.getFile();                               
        if(dirPath == null || fileName == null) {                          
          return;                                                          
        }                                                                  
        ta.setText("");                                                    
        file = new File(dirPath, fileName);                                
        try {                                                              
          BufferedReader bufr = new BufferedReader(new FileReader(file));  
          String line = null;                                              
          while((line = bufr.readLine()) != null) {                        
            ta.append(line + "\r\n");                                      
          }                                                                
          bufr.close();                                                    
        } catch (Exception e1) {                                           
          throw new RuntimeException("error reading");                     
        }                                                                  
      }                                                                    
    });                                                                    
                                                                           
    saveItem.addActionListener(new ActionListener() {                   
      public void  actionPerformed(ActionEvent e) {                        
        if(file == null) {                                                 
          saveDia.setVisible(true);                                        
          String dirPath = openDia.getDirectory();                         
          String fileName = openDia.getFile();                             
          if (dirPath == null || fileName == null) {                       
            return;                                                        
          }                                                                
          file = new File(dirPath, fileName);                              
        }                                                                  
        BufferedWriter buf;                                                
        try {                                                              
          buf = new BufferedWriter(new FileWriter(file));                  
          String text = ta.getText();                                      
          buf.write(text);                                                 
          buf.flush();                                                     
          buf.close();                                                     
        }                                                                  
         catch (Exception e1) {                                            
          throw new RuntimeException("读取失败");                              
        }                                                                  
      }                                                                    
    });                                                                    
                                                                           
    closeItem.addActionListener(new ActionListener() {                  
      public void actionPerformed(ActionEvent e) {                         
        System.exit(0);                                                    
      }                                                                    
    });                                                                    
                                                                           
    f.addWindowListener(new WindowAdapter() {                              
      public void windowClosing(WindowEvent e) {                           
        System.exit(0);                                                    
      }                                                                    
    });                                                                    
                                                                           
  }                                                                        
                                                                           
                                             
  /**                                        
   * @param args                             
   */                                        
  public static void main(String[] args) {                                 
    new TextEditor();                                                      
  }                                                                        
}                                                                          
                                                                           