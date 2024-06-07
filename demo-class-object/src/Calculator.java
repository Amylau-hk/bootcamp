import java.math.BigDecimal;

public class Calculator {
 
  // static method -> instance method???
  
  private int X;
  private int Y;

  public void setX(int X) {
    this.X = X;
  }

  public int getX() {
    return this.X;
  }

  public void setY(int Y) {
    this.Y = Y;
  }

  public int getY() {
    return this.Y;
  }

  public int getSum() {
    return this.X + this.Y;
  }

  public int getMultiply() {
    return this.X * this.Y;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static double sum(double x, double y){
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  
  public static double sum(float x, double y){
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static void test(String[] args) {
    // basic for loop
    for (int i = 0; i < args.length; i++){
      System.out.println(args[i]);
    }
  }

  public static void test2(String... args) { // String... -> String[] (they  are the same type)
    // for-each
    for (String s : args) {
      System.out.println(s);
    }

  }

  public static void main(String[] args) {
    
    // sysout
    // static methods
    sum(1, 3); // 4
    Calculator.sum(2, 3); // 5


    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);
    c1.getSum(); // 2+3
    c1.getMultiply(); // 2*3
    System.out.println(c1.getSum());
    System.out.println(c1.getMultiply());

    // Method Overloading
    sum(1, 2); // because you are passing int value, so "overloading" determine
    //"public static int sum(int x, int y)" should be called.

    sum(1.0, 2.0); //3.0
    // "sum(double x, double y)" is called.

    sum(1.0f, 2.0f); // 1.0f -> float value, 2.0f -> float value
    // upcast, promotion
    // "sum(float x, double y)" is called

    // String.valueOf() -> overloading
    String.valueOf(10L); //"10"
    String.valueOf(new char[] {'a', 'b', 'c'}); // "abc"

    Calculator.test(new String[] {"abc", "ijk"});
    Calculator.test2(new String[] {"abc", "ijk"});
    Calculator.test2("abc", "ijk");

  }


}
