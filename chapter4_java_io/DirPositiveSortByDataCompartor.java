package chapter4_java_io;
                            
import java.io.File;        
import java.util.Comparator;
                            
public class DirPositiveSortByDataCompartor implements Comparator<File> {
  
  /** 
   * @param f1
   * @param f2
   * @return int
   */
  //Positive Sort                    
  public int compare(File f1, File f2) {
    long result = f1.lastModified()-f2.lastModified();          
    if(result > 0) {                                            
      return 1;                                                 
    } else if(result == 0) {                                    
      return 0;                                                 
    } else {                                                    
      return -1;                                                
    }                                                           
  }                                                             
}                                                               
                                                                