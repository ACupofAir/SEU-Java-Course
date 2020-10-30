package chapter3;
                          
public class BadObjectException extends Exception{
  private Object badObject;                       
                                                  
  public BadObjectException(Object object, String msg) {
    super(msg);                                   
    this.badObject = object;                      
  }                                               
                                                  
  public Object getBadObject() {                  
    return this.badObject;                        
  }                                               
}                                                       