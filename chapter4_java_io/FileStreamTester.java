package chapter4_java_io;
                                                         
import java.io.FileInputStream;                          
import java.io.FileOutputStream;                         
import java.io.IOException;                              
import java.io.File;                               
                                                         
public class FileStreamTester {                          
                                                         
  private FileInputStream fis;                           
  private FileOutputStream fos;                          
                                                         
  //Constructor
  public FileStreamTester(File file) throws IOException {
    createFile(file);                     
    this.fis = new FileInputStream(file); 
    this.fos = new FileOutputStream(file); 
  }                                                
                                                   
  public static void createFile(File file) throws IOException {
    if(!file.exists() || !file.isFile()) {
      file.createNewFile();              
    }                                    
  }                                       
                                                 
  public void close() throws IOException {       
    fis.close();                                 
    fos.close();                                 
  }                                                 
                                                    
  public int read() throws IOException {            
    return fis.read();                              
  }                                                 
                                                    
  public void write(int arg) throws IOException {   
    fos.write(arg);                                 
  }                                                 
                                                    
  public void write(byte[] arg) throws IOException {
    fos.write(arg);                           
  }                                           
                                              
  public int available() throws IOException { 
    return fis.available();                   
  }                                           
                                              
  public void printFile() throws IOException {
    int i = this.read();                                   
    while(i != -1) {                                       
      System.out.println((char)i);                         
      i = this.read();                                     
    }                                                      
  }                                                        
                                                           
  public static void main(String[] args) {                 
    try{                                                   
      File file = new File("./test.dat");                  
      FileStreamTester tester = new FileStreamTester(file);
      tester.write(260);                            
      tester.write('b');                           
      tester.write(new String("好").getBytes());    
      System.out.println(tester.available() + " size");
      tester.printFile();   
      tester.close();       
    } catch(IOException e) {
      e.printStackTrace();
    }                                                     
  }                                                        
}                                                          