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

  //public static void changeName(Person jerry) {
    //jerry.name = "Jerry";
    //jerry = null;
  //}

  //protected void finalize() {
    //counter--;
  //}

  public void greet() {
    System.out.println("Hello, I'm "+this.name+", I'm "+this.age+" years old.");
  }

  public static void main(String[] args) {
    Person tom = new Person("tom",18);
    System.out.println(tom);
    //for(int i = 0; i < 10; i++) { Person tom = new Person("tom2", 18);
      //tom.greet();
    //}
  //System.gc();
  //System.out.println(Person.counter);
      //Person tom = new Person("tom2", 18);
      //Person.changeName(tom);
      //System.out.println(tom == null);
      //if(tom != null) {
        //System.out.println(tom.name);
      //}
    //System.gc();
    //System.out.println("Mem: " + Runtime.getRuntime().freeMemory());
    //System.out.println("Creating persons..");
    //ArrayList<Person> area = new ArrayList<Person>();
    //for(int j = 10; j < 100000000; j*=10) {
      //for(int i = 0; i < j; i++) {
        //area.add(new Person("A",1));
      //}
    //System.out.println("Mem: " + Runtime.getRuntime().freeMemory());
    //System.out.println("Colleting garbage...");
    //System.gc();
    //System.out.println("Mem: " + Runtime.getRuntime().freeMemory());
    //System.out.println();
    //}
  }
}
