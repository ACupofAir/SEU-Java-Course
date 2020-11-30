package chapter4_java_io;
                                                             
import java.io.*;                                              
import java.util.Scanner;                               
public class TestWriter {                                      
                                                               
  private FileWriter fWriter;                                  
  private FileReader fReader;                                  
                                                               
  public TestWriter(File file) throws IOException {            
    createFile(file);                                          
    this.fWriter = new FileWriter(file,true);                 
    this.fReader = new FileReader(file);                      
  }                                                            
                                                        
  
  /** 
   * @throws IOException
   */
  public void print_file() throws IOException {              
    int character = this.fReader.read();                
    while(character != -1) {                            
      System.out.println((char)character);              
      character = this.fReader.read();                  
    }                                                   
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
   * @param args
   * @throws IOException
   */         
  public static void main(String[] args) throws IOException {  
    File file = new File("./TestWriter.txt");                 
    TestWriter tester = new TestWriter(file);                 
    tester.fWriter.write("COSE".toCharArray());                     
    tester.fWriter.write("软件学院".toCharArray());                     
    Scanner sc = new Scanner(System.in);                      
    tester.fWriter.write(sc.next().toCharArray());                     
    tester.fWriter.flush();                                   
    tester.print_file();                                      
                                                               
  }                                                            
                                                               
}                                                              
                                                               