package chapter5_java_collection;
                                                                                 
import java.util.*;                                                              
                                                                                 
public class LabWorkStringVSList {                                               
  public ArrayList<String> aList = new ArrayList<String>(1000);                  
  public LinkedList<String> lList = new LinkedList<String>();                                               
                                                                                 
  public static String getRandomString(int length) {     
    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();                        
    StringBuffer sb = new StringBuffer();                
    for (int i = 0; i < length; i++) {                   
      int number = random.nextInt(62);                   
      sb.append(str.charAt(number));                     
    }                                                    
    return sb.toString();                                      
  }                                                                            
                                                                                 
  public LabWorkStringVSList() {                                                    
    for(int i = 0; i < 1000; i++) {                                                 
      aList.add(getRandomString(4));                                                            
      lList.add(getRandomString(4));                                                
    }                                                                               
  }                                                                                 
                                                                                    
  public void testGet() {                                                           
    long startTime = System.currentTimeMillis();                                    
    for(int i = 0; i < 1000000; i++) {                                              
      String temp = lList.get((int)Math.random()%1000);                             
    }                                                                               
    long endTime = System.currentTimeMillis();                                      
    System.out.println("lList get time: " + (endTime-startTime)+"ms");              
                                                                                    
    startTime = System.currentTimeMillis();                                         
    for(int i = 0; i < 1000000; i++) {                                              
      String temp = aList.get((int)Math.random()%1000);                             
    }                                                                               
    endTime = System.currentTimeMillis();                                           
    System.out.println("aList get time: " + (endTime-startTime)+"ms");              
  }                                                                                 
                                                                                    
  public void testTraverse() {                                                      
    long startTime = System.currentTimeMillis();                                    
    for(int i = 0; i < 1000000; i++) {                                              
      String temp = lList.get((int)Math.random()%1000);                             
    }                                                                               
    long endTime = System.currentTimeMillis();                                      
    System.out.println("lList get time: " + (endTime-startTime)+"ms");              
                                                                                    
    startTime = System.currentTimeMillis();                                         
    for(int i = 0; i < 1000000; i++) {                                              
      String temp = aList.get((int)Math.random()%1000);                             
    }                                                                               
    endTime = System.currentTimeMillis();                                           
    System.out.println("aList get time: " + (endTime-startTime)+"ms");              
  }                                                                                 
                                                                                    
  public static void main(String[] str) {                                           
    LabWorkStringVSList tester = new LabWorkStringVSList();                         
    tester.testGet();                                                               
  }                                                                                 
}                                                                                   
                                                                                    