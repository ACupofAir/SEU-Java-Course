package chapter2;
                                                        
import java.lang.reflect.Array;                          
import java.util.Arrays;                                  
                                                                       
public class BenchmarkImpl extends Benchmark{                          
  public void printArray() {               
    System.out.println(Arrays.toString(this.unsortedArray));
  }                                                      
                                                         
  public void swap(int[] myArray, int i, int j) {                      
    int temp = myArray[i];                                             
    myArray[i] = myArray[j];                                           
    myArray[j] = temp;                                                 
  }                                                                    
  public void mySort(int[] myArray) {                                  
    for(int i = 0; i < myArray.length; i++) {                          
      for(int j = 0; j <myArray.length-i-1; j++) {                       
        if (myArray[j] > myArray[j + 1])                 
          swap(myArray, j, j + 1);                       
      }                                                                
    }                                                                  
  }                                                                    
  @Override                                                            
  void benchmark() {                                                   
    // Arrays.sort(this.unsortedArray);                                   
    mySort(this.unsortedArray);                          
    this.printArray();                                                 
  }                                                                    
                                                                       
  public static void main(String[] args) {                             
    BenchmarkImpl a = new BenchmarkImpl();                             
    a.printArray();                                                    
    long time = new BenchmarkImpl().repeat();                          
    // System.out.println("This is java sort: ");                      
    System.out.println("This is my sort: "+time+"ns");                 
  }                                                                    
                                                                       
}                                                                      
                                                                       