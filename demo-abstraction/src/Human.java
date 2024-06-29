public class Human extends SuperHuman implements Walkable, Readable{

  // Class can only inherit instance methods, instance variables.
  // Constructor CANNOT be inherited.

  // Parent class should have the same empty constructor if child class need
  public Human() {

  }

  public Human(double height) {
    super(height); // SuperHuman's constrctor
  }

  @Override
  public void walk() {
    System.out.println("Human is walking...");
  }

  @Override
  public void read() {
    System.out.println("Human is reading...");
  }
 // useless, can be use if there is any amendment
  @Override
  public double getHeight() {
    return this.getHeight();
  }


  public static void main(String[] args) {
    System.out.println(Walkable.AGE); // 3, public static final

    Human h1 = new Human();
    h1.walk();

    h1.run(); // default I am running

    Superman superman = new Superman();
    superman.run(); // Superman is running

    Walkable.swim();
  }
}
