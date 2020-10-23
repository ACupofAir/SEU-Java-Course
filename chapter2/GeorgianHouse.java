package chapter2;
                                                                          
                                                                          
public class GeorgianHouse extends House {                                
  private String EavesStyle;                                              
  public void test() {                                                    
    super.test();
    System.out.println("son");                                            
  }                                                                       
  public GeorgianHouse(String door, String windows, String wall, String eaves) {
    super(door, windows, wall);                                                
    EavesStyle = eaves;                                                        
  }                                                                            
                                                                          
  public static void main(String[] args) {                                
    GeorgianHouse a = new GeorgianHouse("door", "windows", "wall", "eaves");
    ((House)a).test();                                                    
  }                                                                       
                                                                                
}                                                                               
                                                                                