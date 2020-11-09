package chapter4_java_io;
                                           
import java.io.*;                          
import java.util.ArrayList;                
                                           
public class BufferTester {                
                                           
  private ArrayList<Integer> intStoreSource; 
  private ArrayList<Integer> intStoreTarget; 
  private final int MAX_STORE_SIZE = 500000; 
  private File file;                         
                                             
  public static int getRandomInt() {              
    return (int)(Math.random()*255);               
  }                                                
                                                   
  private void buildIntStore() {                   
    for(int i = 0; i < MAX_STORE_SIZE; i++) {      
      intStoreSource.add(getRandomInt());          
    }                                              
  }                                                
                                                   
  public BufferTester(File file) {                 
    this.intStoreSource = new ArrayList<Integer>();
    this.intStoreTarget = new ArrayList<Integer>();
    this.buildIntStore();   
    this.file = file;       
  }                                                
                            
  public void useBufferTester() {

  }               
                                                   
}                                                  