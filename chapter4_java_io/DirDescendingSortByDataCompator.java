package chapter4_java_io;
                            
import java.io.File;        
import java.util.Comparator;
                            
public class DirDescendingSortByDataCompator implements Comparator<File> {
  
  /** 
   * @param f1
   * @param f2
   * @return int
   */
  //Descending Sort                            
  public int compare(File f1, File f2) {     
    long result = f2.lastModified()-f1.lastModified();          
    if(result > 0) {                                            
      return 1;                                                 
    } else if(result == 0) {                                    
      return 0;                                                 
    } else {                                                    
      return -1;                                                
    }                                                           
  }                                                             
}                                                               
                                                                