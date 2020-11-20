package chapter4_java_io;
                                                   
import java.io.*;                                  
                                                   
public class File_one {                            
                                                   
  
  /** 
   * @param args
   */
  public  static void main(String[] args) {              
                                                         
    // File file = new File("c:/Windows/explorer.exe");  
    // File file = new File("c:/Windows","explorer.exe");
    File file = new File(".");                           
                                                         
    System.out.println(file.exists());                   
                                                         
  }                                                      
                                                         
}                                                        
                                                         