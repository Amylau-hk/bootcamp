package Shape;

import java.math.BigDecimal;

public abstract class Shape {

  // abstarct class can create instance method without implementation
  // Mehod without implementation -> abstract method
  public abstract double area();
  

    // static method
  public static double circleArea(double radius) {
    return BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public static double totalArea(Circle[] circles) {
    //
  }

  public static double totalArea(Square[] squares) {
    // 
  }

  // CH17
  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) { // s is object refernce point to actual object {Circle/Square}
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.circleArea(3.0d));
    Shape[] shapes = new Shape[] {new Circle(3.0d), new Square(4.0d)};
    System.out.println(Shape.totalArea(shapes)); // 44.274333882308134

    // extra example (BigDecimal vs StringBuilder Design Difference)
  StringBuilder sb = new StringBuilder("hello");
  sb.append("world"); // Java: You dont have to assign the return object to a reference
  // sb = sb.append("world"); // WHY not BE LIKE THIS ??????
  System.out.println(sb); // helloworld
  // you should refer to Box.java for the answer
  }

  
}

