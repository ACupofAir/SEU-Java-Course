package chapter5_java_collection.Homework;
                            
public class Student {                      
  private String name;                      
  private int id;                           
  private double score;                     
                                            
  public Student(String name, int id, double score) {
    this.name = name;                       
    this.id = id;                           
    this.score = score;                                                  
  }                                               
  public String getName() {                       
    return name;                                  
  }                                               
                                                  
  public void setName(String name) {              
    this.name = name;                             
  }                                               
                                                  
  public int getId() {                            
    return id;                                    
  }                                               
                                                  
  public void setId(int id) {                     
    this.id = id;                                 
  }                                               
                                                  
  public double getScore() {                      
    return score;                                 
  }                                               
                                                  
  public void setScore(double score) {            
    this.score = score;                           
  }                                               
                                                  
}                                                 
                                                  