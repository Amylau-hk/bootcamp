package Shape;

public class MiniCircle extends Circle{

  private String color;

  public MiniCircle(double radius, String color) {
    super(radius);
    this.color = color;
  }

  // @Override
  // public double area() {
  
  // }
  // 可以不用寫, 直接call parent 的method
    // e.g System.out.println(mc.area()); // 28.274

  public static void main(String[] args) {
    MiniCircle mc = new MiniCircle(3.0d, "RED");
    System.out.println(mc.getRadius()); // 3.0
    System.out.println(mc.area()); // 28.274
  }
}
