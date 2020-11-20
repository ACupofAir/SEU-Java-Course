package chapter1;
                           
import java.util.Scanner;  
                           
public class Person {      
  public String name;      
  public int age;          
                           
  Person(String name, int age) {
    this.name = name;       
    this.age = age;         
  }                         
                            
  public void greet() {     
    System.out.println("My name is " + name + " and my age is " + age);
  }                         
                            
  
  /** 
   * @param args[]
   */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Person wj = new Person(sc.next(), 18);
    wj.greet();             
  }                         
}                           
                            