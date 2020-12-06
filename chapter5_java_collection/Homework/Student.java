package chapter5_java_collection.Homework;
                                   
import java.io.Serializable;
import java.util.*;                

public class Student implements Serializable {
  private String name;                                              
  private int id;                                                   
  private double score;                                             
                                                                    
  public Student(String name, int id, double score) {               
    this.name = name;                                               
    this.id = id;                                                                 
    this.score = score;                                                           
  }                                                                               
                                                                                  
  //Generate random studnet                                                       
  public Student() {                                                              
    this.name = getRandomString(5);                                               
    this.id = getRandomID();                                                    
    this.score = Math.random()*100;                                             
  }                                                                               
                                                                                  
  
  /** 
   * @param length
   * @return String
   */
  public static String getRandomString(int length) {                              
    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiop";
    Random random = new Random();                                                           
    StringBuffer sb = new StringBuffer();                                                   
    for (int i = 0; i < length; i++) {                                                      
      int number = random.nextInt(62);                                                      
      sb.append(str.charAt(number));                                                        
    }                                                                                       
    return sb.toString();                                                                   
  }                                                                                         
                                                                                            
  
  /** 
   * @return int
   */
  public static int getRandomID() {                                                         
    Random random = new Random();                                                           
    return (random.nextInt(90000000) + 10000000);                                           
  }                                                                                         
                                                                                            
  
  /** 
   * @return String
   */
  public String getName() {                                                                 
    return name;                                                                            
  }                                                                                         
                                                                                            
  
  /** 
   * @param name
   */
  public void setName(String name) {                                                        
    this.name = name;                                                                       
  }                                                                                         
                                                                                            
  
  /** 
   * @return int
   */
  public int getId() {                                                                      
    return id;                                                                              
  }                                                                                         
                                                                                            
  
  /** 
   * @param id
   */
  public void setId(int id) {                                                               
    this.id = id;                                                                           
  }                                                                                         
                                                                                            
  
  /** 
   * @return double
   */
  public double getScore() {                                                                
    return score;                                                                           
  }                                                                                         
                                                                                            
  
  /** 
   * @param score
   */
  public void setScore(double score) {                                                      
    this.score = score;                                                                     
  }                                                                                         
                                                                                            
}                                                                                           
                                                                                            