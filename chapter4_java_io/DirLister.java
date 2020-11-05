package chapter4_java_io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Comparator;
                             
public class DirLister { 
  public void listDirectory(File path, FilenameFilter f, Comparator c) {
    if(f.accept(path,"*.log"))                                          
  }                                                                     
                                                                        
}                                                                       
                                                                        