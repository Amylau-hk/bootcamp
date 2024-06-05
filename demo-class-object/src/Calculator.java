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
  }


}
