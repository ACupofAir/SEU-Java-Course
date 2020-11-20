package chapter2;
import java.lang.Runtime;
import java.util.ArrayList;
public class Person {
  private String name;
  private int age;
  public static int counter = 0;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    counter++;
  }

  
  /** 
   * @return String
   */
  public String toString() {
    return String.valueOf(this.age);
  }
  
  public void greet() {
    System.out.println("Hello, I'm "+this.name+", I'm "+this.age+" years old.");
  }
  
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Person tom = new Person("tom",18);
    System.out.println(tom.toString());
  }
  
} 
  