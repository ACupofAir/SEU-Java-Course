package chapter4_java_io;
                                                                                                                               
import java.io.*;                                                                                                              
import java.nio.*;                                                                                                             
import java.nio.channels.*;                                                                                                    
                                                                                                                               
                                                                                                                               
public class LargeMappedFiles {                                                                                                
  static int length  = 0x8FFFFFF;                                                                                              
  
  /** 
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {                                                                    
    MappedByteBuffer out = new RandomAccessFile("./test.dat","rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
    long begin = System.currentTimeMillis();                      
    for(int i = 0; i < length; i++) {                             
      out.put((byte)'x');                                         
    }                                                             
    long end = System.currentTimeMillis();                        
    System.out.print("Finished writing using "+(end - begin)+"ms.");
    for(int i = length/2; i < length/2 + 6; i++) {
      System.out.print((char)out.get(i));    
    }                                        
  }                                                                                                                             
                                                                                                                                
}                                                                                                                               
                                                                                                                                