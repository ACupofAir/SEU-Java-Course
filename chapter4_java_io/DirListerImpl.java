package chapter4_java_io;
                                          
import java.util.Arrays;                                                
import java.io.File;                                                    
import java.io.FilenameFilter;                                          
import java.util.Comparator;                                            
                                                                       
public class DirListerImpl implements DirLister{                        
  public void listDirectory(File file, FilenameFilter f, Comparator c) {
    if(!file.exists()) {                                                
      System.out.println("Path Error.");                                
    } else if(file.isFile()) {                                          
      System.out.println("Not a directory.");                           
    } else {                                                            
      File[] files = file.listFiles(f);                                 
      System.out.println(files.length);                                 
      Arrays.sort(files,c);                                             
      for(int i = 0; i < files.length; i++) {                           
        if(files[i].isFile()) {                                                              
          System.out.println(files[i]);                                                      
        }                                                                                    
      }                                                                                      
    }                                                                                        
  }                                                                                          
                                                                                             
  public static void main(String[] args) {                                                   
    DirLister lister = new DirListerImpl();                                                  
    FilenameFilter filter = new LogFilter(".*log");                                          
    lister.listDirectory(new File("c:/Windows"), filter, new DescendingAlphabeticComparator());
  }                                                                                          
}                                                                                            
                                                                                             