package chapter4_java_io;
                                           
public class Student {                     
  private long id;                          
  private String name;                     
  private double score;                    
                                           
  public Student(long id, String name, double score) {
    this.id = id;                           
    this.name = name;                       
    this.score = score;                     
  }                                         
                                            
                                            
  /**                                       
   * @return int                            
   */                                       
  public long getId() {                      
    return id;                              
  }                                         
                                            
                                            
  /**                                       
   * @param id                              
   */                                       
  public void setId(int id) {               
    this.id = id;                           
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
                                            