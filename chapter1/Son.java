package chapter1;

public class Son extends Father {
  public String name = "Son";

  public void showName() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    Father person = new Son();
    person.showName();
  }
}