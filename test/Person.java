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

    public static void main(String args[]) {
        Person wj = new Person("hh", 18);
        wj.greet();
    }
}
