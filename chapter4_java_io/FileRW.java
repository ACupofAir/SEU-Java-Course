package chapter4_java_io;
                                                                    
import java.io.*;                                                       
                                                                        
public class FileRW {                                                   
                                                                        
  private DataInputStream fInputStream;                                 
  private DataOutputStream fOutputStream;                               
                                                                        
  public FileRW(File file) throws IOException {                         
    createFile(file);                                                   
    this.fInputStream = new DataInputStream(new FileInputStream(file));             
    this.fOutputStream = new DataOutputStream(new FileOutputStream(file));                 
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
   * @param str              
   * @throws IOException     
   */                        
  public void writeStr(String str)throws IOException {       
    fOutputStream.writeBytes(str);                           
  }                                                          
                                                                
                             
  /**                        
   * @param str              
   * @throws IOException     
   */                        
  public void writeUTF(String str) throws IOException {         
    fOutputStream.writeUTF(str);                                
  }                                                             
                                                                        
                             
  /**                        
   * @param student          
   * @throws IOException     
   */                        
  public void write(Student student) throws IOException {               
    fOutputStream.writeBytes(Long.toString(student.getId()));   
    fOutputStream.writeBytes("\t");                                       
    fOutputStream.writeBytes(student.getName());                          
    fOutputStream.writeBytes("\t");                                       
    fOutputStream.writeBytes(Double.toString(student.getScore()));                         
    fOutputStream.writeBytes("\n");                                       
  }                                                                     
                                                                        
                             
  /**                        
   * @return String          
   * @throws IOException     
   */                        
  public String readLine() throws IOException {                         
    return fInputStream.readLine();                                     
  }                                                                     
                                                                        
                             
  /**                        
   * @throws IOException     
   */                        
  public void print_file() throws IOException {                         
    String count;                                                       
    while((count = this.readLine()) != null) {                          
      System.out.println(count);                                        
    }                                                                   
  }                                                                     
                                                                
                             
  /**                        
   * @throws IOException     
   */                                  
  public void close() throws IOException {                      
    fInputStream.close();                                       
    fOutputStream.close();                                      
  }                                                             
                                                                        
                                       
  /**                                  
   * @param args                       
   */                                  
  public static void main(String[] args) {                      
    //中文乱码                   
    // Student A = new Student(71108501, "张三", 80.0);           
    // Student B = new Student(71108502, "李四", 79.5);           
    // Student C = new Student(71108503, "王五", 91.0);           
    // Student D = new Student(71108504, "赵六", 60.0);           
    // Student E = new Student(71108505, "宋七", 18.6);           
    Student A = new Student(71108501, "ZhangSan", 80.0);             
    Student B = new Student(71108502, "LiSi", 79.5);              
    Student C = new Student(71108503, "WangWu", 91.0);              
    Student D = new Student(71108504, "ZhaoLiu", 60.0);              
    Student E = new Student(71108505, "SongQi", 18.6);              
    Student F = new Student(71108506, "QianDuo", 66.6);              
    try {                                                       
      File file = new File("./table.txt");                      
      FileRW fileRW = new FileRW(file);                         
      fileRW.writeStr("Id\tName\tScore\n");                     
      fileRW.write(A);                                          
      fileRW.write(B);                                          
      fileRW.write(C);                                          
      fileRW.write(D);                                          
      fileRW.write(E);                                          
      fileRW.print_file();                                      
      System.out.println("Add QianDuo");                    
      fileRW.write(F);                                      
      //Attention:此处读取文件是从上一次输入流的位置继续读入，故只有一行输出，实际文本并未被覆盖
      fileRW.print_file();                                      
    } catch (IOException e) {                                   
      e.printStackTrace();                                      
    }                                                           
                                                                
  }                                                             
                                                                        
                                                                        
}                                                                       
                                                                        