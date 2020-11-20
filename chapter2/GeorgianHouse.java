package chapter2;
                                                                               
                                                                               
public class GeorgianHouse extends House {                                     
  public String className = "GeorgianHouse";
  public void showName() {             
    System.out.println("The extended class: " + className);
  }                                                      
                                                                               
  
  /** 
   * @param args
   */
  public static void main(String[] args) {                                     
    GeorgianHouse gHouse = new GeorgianHouse();
    House house = gHouse;              
    System.out.println(gHouse.className);
    System.out.println(house.className);
    gHouse.showName();
    house.showName();
  }                                                                            
                                                                                
}                                                                               
                                                                                