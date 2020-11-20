package chapter2;      
import java.util.Random;                   
import java.util.Arrays;                   
                                            
public abstract class Benchmark {            
  private final int COUNT = 100;             
  private Random randInt = new Random();   
  public final int[] unsortedArray = new int[1000];
  public Benchmark() {                         
    for(int i = 0;  i < unsortedArray.length; i++) {
      unsortedArray[i] = randInt.nextInt()%100; 
    }                                          
  }                                                   
                                                      
     
  /** 
   * @param repeat(
   */
  abstract void benchmark();                          
                                                      
     
  /** 
   * @return long
   */
  public final long repeat() {                        
    long start = System.nanoTime();                   
    for(int i = 0; i < COUNT; i++) {                  
      benchmark();                                    
    }                                                 
    return ((System.nanoTime()-start))/COUNT;         
  }                                                   
                                                      
}                                                     
                                                      