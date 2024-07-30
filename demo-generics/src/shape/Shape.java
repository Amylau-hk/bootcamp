package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // public Shape() {

  // }

  // approach 1
  public static double area(List<Shape> shapes) {
    // BigDecimal bd = new BigDecimal(0.0); // error
    BigDecimal bd  = BigDecimal.valueOf(0.0);
    for(Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  // approach 2: Generics
  // "<T extends Shape>" is to describe the parent relationship 
  public static <T extends Shape> double area2(List<T> shapes) {
    BigDecimal bd  = BigDecimal.valueOf(0.0);
    for(Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  // Question
  // List<Object> vs List<T>? difference?

  public static double area3(List<? extends Shape> shapes) {
    return -1.0;
  }

  public static void main(String[] args) {
    // Circle vs Shape -> Parent
    // List<Shape> vs List<Circle> -> NOT parent
    List<Shape> shapes = new ArrayList<>();
    // fixed to List<Shape>
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));
    shapes.add(new Square(5.0));

    System.out.println(Shape.area(shapes)); // 83.69202829163208, after add square: 108.69202829163208
    System.out.println(Shape.area2(shapes)); // 83.69202829163208

    // List<? extends Shape> shapes2 = new ArrayList<Circle>();
    // shapes2 may point to Circle/ Square
    // Like
    // shapes2 = new ArrayList<Square>();
    // shapes2.add(new Square(5.0));
    // NOT ok, during compile-time, we do not know the actual type of object reference by shape2
    // Compile time error, as it is not define the type of the List


    
    List<? super Shape> shapes2 = new ArrayList<>();
    // ArrayList<Square> object
    // ArrayList<Circle> object
    // Ensure the List putting Shape.class or above(e,g Object)
    // Therefore, the class under Shape or Object (child), are able to use
    shapes2.add(new Circle(3.4));
    shapes2.add(new Square(5.0));
    // shapes2.add(new Bird()); // NOT OK? because we do not know actual type of shapes2 
    // shapes2.add(new Object());
    

    // List<Object> objects = new ArrayList<Circle>(); // NOT OK (NOT Parent)
    Object object = new Circle(2.4); // OK (Parent)

  }
}
