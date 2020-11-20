package chapter4_java_io;
                                                         
import java.io.FileInputStream;                          
import java.io.FileOutputStream;                         
import java.io.IOException;                             
import java.util.ArrayList;                             
import java.io.File;                                    
                                                         
public class FileStreamTester {                          
                                                         
  private FileInputStream fis;                           
  private FileOutputStream fos;                          
                                                        
  private final int MAX_STORE_SIZE = 500000;            
                                                        
  /**                                                   
   * @return int                                        
   */                                                   
  public static int getRandomInt() {                    
    return (int)(Math.random()*255);                    
  }                                                     
                                                         
  //Constructor                                         
  public FileStreamTester(File file) throws IOException {
    createFile(file);                                   
    this.fis = new FileInputStream(file);               
    this.fos = new FileOutputStream(file);              
  }                                                     
                                                        
                                                        
  /**                                                   
   * @param file                                        
   * @throws IOException                                
   */                                                   
  public static void createFile(File file) throws IOException {
    if(!file.exists() || !file.isFile()) {              
      file.createNewFile();                             
    }                                                   
  }                                                     
                                                        
                                                        
  /**                                                   
   * @throws IOException                                
   */                                                   
  public void close() throws IOException {              
    fis.close();                                        
    fos.close();                                        
  }                                                     
                                                        
                                                        
  /**                                                   
   * @return int                                        
   * @throws IOException                                
   */                                                   
  public int read() throws IOException {                
    return fis.read();                                  
  }                                                     
                                                        
                                                        
  /**                                                   
   * @param arg                                         
   * @throws IOException                                
   */                                                   
  public void write(int arg) throws IOException {       
    fos.write(arg);                                     
  }                                                     
                                                        
                                                        
  /**                                                   
   * @param arg                                         
   * @throws IOException                                
   */                                                   
  public void write(byte[] arg) throws IOException {    
    fos.write(arg);                                     
  }                                                     
                                                        
                                                        
  /**                                                   
   * @return int                                        
   * @throws IOException                                
   */                                                   
  public int available() throws IOException {           
    return fis.available();                             
  }                                                     
                                                        
                                                        
  /**                                                   
   * @throws IOException                                
   */                                                   
  public void printFile() throws IOException {          
    int i = this.read();                                   
    while(i != -1) {                                       
      System.out.println((char)i);                         
      i = this.read();                                     
    }                                                      
  }                                                        
                                                           
                                                        
  /**                                                   
   * @param args                                        
   */                                                   
  public static void main(String[] args) {                 
    try{                                                   
      File file = new File("./test.dat");                  
      FileStreamTester tester = new FileStreamTester(file);
      tester.write(260);                                
      tester.write('b');                                
      System.out.println(tester.available() + " size"); 
      tester.printFile();                               
      tester.close();                                   
    } catch(IOException e) {                            
      e.printStackTrace();                              
    }                                                     
  }                                                        
}                                                          