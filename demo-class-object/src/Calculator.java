public class Calculator {
 
  // static method -> instance method???
  
  private int sum;
  private int multiply;
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

  public void setSum(int sum) {
    this.sum = sum;
  }

  public int getSum() {
    return this.X + this.Y;
  }

  public void setMultiply(int multiply) {
    this.multiply = multiply;
  }

  public int getMultiply() {
    return this.X * this.Y;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    
    // sysout
    sum(1, 3); // 4
    Calculator.sum(2, 3); // 5


    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);
    c1.sum(); // 2+3
    c1.multiply(); // 2*3
  }


}
