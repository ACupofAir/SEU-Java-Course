package chapter2;

public class ParameterPassing {
  public static void changeInt(int innerInt) {
    innerInt += 10;
  }
  public static int add(int... numbers) {
    int result = 0;
    for(int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }
  public static int add(int a, int b) {
    return (a+b);
  }

  public static void main(String[] args) {
    int i = 5;
    ParameterPassing.changeInt(i); 
    System.out.println(i);
    int a = ParameterPassing.add(10,100);
    System.out.println(a);
  }
}
