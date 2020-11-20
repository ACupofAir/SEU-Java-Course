package chapter4_java_io;
                                                                        
import java.util.Arrays;                                                
import java.util.Scanner;                                               
import java.io.File;                                                    
import java.io.FilenameFilter;                                          
import java.util.Comparator;                                            
                                                                        
public class DirListerImpl implements DirLister{                        
                                                               
  /**                                                          
   * @param file                                               
   * @param f                                                  
   * @param c                                                  
   */                                                          
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
                                                                                                 
                                                               
  /**                                                          
   * @param args                                               
   */                                                          
  public static void main(String[] args) {                                                       
    Scanner sc = new Scanner(System.in);                                                         
    DirLister lister = new DirListerImpl();                                                      
    System.out.println("Input the suffix of the files: such as \".*log\"");                               
    String fileSuffix = sc.nextLine();                                                  
    System.out.println("Input the dir of the files: such as \"c:/Windows\"");                               
    String fileDir = sc.nextLine();                                     
    FilenameFilter filter = new LogFilter(fileSuffix);                                  
    System.out.println("Select sort method: \n 1.Positive \n 2.Scesending");                      
    int cmd = sc.nextInt();                                                                      
    if(cmd == 1) {                                                                               
      lister.listDirectory(new File(fileDir), filter, new DirPositiveSortByDataCompartor());
    } else {                                                                                  
      lister.listDirectory(new File(fileDir), filter, new DirDescendingSortByDataCompator());
    }                                                                                            
    // lister.listDirectory(new File("c:/Windows"), filter, new DescendingAlphabeticComparator());  
  }                                                                                              
}                                                                                                
                                                                                                 