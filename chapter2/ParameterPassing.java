package chapter2;

public class ParameterPassing {
  
  /** 
   * @param innerInt
   */
  public static void changeInt(int innerInt) {
    innerInt += 10;
  }
  
  /** 
   * @param numbers
   * @return int
   */
  public static int add(int... numbers) {
    int result = 0;
    for(int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }
  
  /** 
   * @param a
   * @param b
   * @return int
   */
  public static int add(int a, int b) {
    return (a+b);
  }
  
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    int i = 5;
    ParameterPassing.changeInt(i); 
    System.out.println(i);
    int a = ParameterPassing.add(10,100);
    System.out.println(a);
  }
} 
  