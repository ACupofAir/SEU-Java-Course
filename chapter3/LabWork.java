package chapter3;
 
public class LabWork {
  public static void main(String[] args) {
    Person p1 = new Person("Tom", 18);
    Person p2 = new Person("Tom", 18);
    Person p3 = new Person("Jack", 18);
    Person p4 = p1;   
    Person p5 = null; 
                                         
    try {                                
      p5 = (Person) p1.clone();          
    } catch (Exception e) {              
      e.printStackTrace();               
    }                                    
    Person source = p1;                  
    Person target = p5;                  
    try {                                
      if (source.hashCode() != target.hashCode())
        throw (new BadObjectException(target));
      else                               
        System.out.println("Same Hashcode.");
    } catch (BadObjectException e) {     
      System.out.println("The Source Hashcode: " + source.hashCode());
      System.out.println("Bad Object Hashcode: " + ((Person) e.getBadObject()).hashCode());
      System.out.println("p2:" + p2.hashCode());
      System.out.println("p3:" + p3.hashCode());
      System.out.println("p4:" + p4.hashCode());
      System.out.println("p5:" + p5.hashCode());
    }                                    
                                         
  }                                      
                                         
}                                        