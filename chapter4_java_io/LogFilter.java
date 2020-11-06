package chapter4_java_io;
                                                
import java.io.FilenameFilter;                                      
import java.io.File;                                          
import java.util.regex.Pattern;                                 
                                                                
public class LogFilter implements FilenameFilter {                  
  private Pattern pattern;                                      
  public LogFilter(String regex) {                              
    pattern = Pattern.compile(regex);                           
  }                                                             
                                                                
  public boolean accept(File dir, String name) {                
    return pattern.matcher(new File(name).getName()).matches();                  
  }                                                             
}                                                               
                                                                