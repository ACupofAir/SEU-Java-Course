package chapter5_java_collection;
                                                                                      
import java.lang.System.Logger;
import java.util.ArrayList;                                                                    
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;                                                                       
import java.util.*;
                                                                                               
public class tester {                                                                          
                                                                                               
  /**                                                                                          
   * @param args                                                                               
   */                                                                                          
  public static void main(String[] args)                                                       
  {                                                                                               
    // String[][] str1 = new String[10][10];                                                         
    // String[][] str2 = new String[10][10];                                                         
    // int num = 0;                                                                                  
    // for(int i = 0; i < 10; i++) {                                                                 
    //   for(int j = 0; j < 10; j++) {                                                               
    //     str1[i][j] = String.valueOf(num);                                                         
    //     str2[i][j] = String.valueOf(num);                                                         
    //     num++;                                                                                    
    //   }                                                                                                           
    // }                                                                                                             
    // System.out.println(Arrays.hashCode(str1));                                                                    
    // System.out.println(Arrays.hashCode(str2));                                                                    
    // System.out.println(Arrays.equals(str1,str2));                                                                 
    // System.out.println(Arrays.toString(str1));                                                                    
    // System.out.println(Arrays.deepToString(str1));                                                                
    // System.out.println(Arrays.deepEquals(str1, str2));                                                            
    // System.out.println(str1.equals(str2));                                                                        
                                                                                                                     
    // ArrayList<String> list = new ArrayList<String>();                                                                
    // list.add("Kobe");                                                                                                
    // list.add("Tmac");                                                                                                
    // list.remove("Tmac");                                                                                             
    // list.remove(0);                                                                                                  
    // list.clear();                                                                                                    
    // list.add("Lebron");                                                                                              
    // System.out.println(list.contains("Lebron"));                                                                     
    // System.out.println(list.get(0));                                                                                 
    // list.set(0,"Kobe");                                                                                              
    // System.out.println(list.get(0));                                                                                 
    // System.out.println(list.indexOf("Kobe"));                                                                        
    // System.out.println(list.size());                                                                                 
    // System.out.println(list.isEmpty());                                                                              
                                                                                                                           
    // String[] list_ = new String[10];                                                                                    
    // System.out.println(list_.length);                                                                                   
                                                                                                                           
    //Linked List Tester:                                                                                                  
    // LinkedList<String> list = new LinkedList<String>();                                                                 
    // list.add("Kobe");                                                                                                   
    // list.addFirst("Tmac");                                                                                              
    // list.addLast("Lebron");                                                                                             
    // list.addLast("Paul");                                                                                               
    // list.removeFirst();                                                                                                 
    // list.removeLast();                                                                                                  
    // list.add(1,"Tmac");                                                                                                 
                                                                 
    //MapTest:                                                   
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(71119138, "WangJun");      
    map.put(71119133, "WangDun");      
    map.put(71119128, "DangJun");      
    String name = map.get(71119128);   
    map.remove(71119138);              
    Set keySet = map.keySet();         
    Collection valueSet = map.values();
    Set entrySet = map.entrySet();
  }                                                                                                                        
}                                                                                                                          
                                                                                                                           