package chapter5_java_collection;
  
import java.util.Comparator;
  
public class CaseInsensitiveCompartor implements Comparator<String> {
                            
  /**                       
   * @param str1            
   * @param str2            
   * @return int            
   */                       
  public int compare(String str1, String str2) {
    return str1.toLowerCase().compareTo(str2.toLowerCase());
  }                         
}                           
                                                                   
                                                                   