package chapter3;
                                                             
public class Person implements Cloneable{                    
  public String name;                                        
  public int age;                                            
  public Person(String name, int age) {                      
    this.name = name;                                        
    this.age = age;                                          
  }                                                          
                                                             
                                                      
  /**                                                 
   * @return Object                                   
   */                                                 
  public Object clone() {                             
    try {                                             
      return (Person)super.clone();                   
    } catch (Exception e) {                           
      e.printStackTrace();                            
      return null;                                    
    }                                                 
  }                                                   
                                                      
                                                      
  /**                                                 
   * @return int                                      
   */                                                 
  public int hashCode(){                              
    return this.name.hashCode() + age.name.hashCode();
  }                                                   
}                                                     
                                                             