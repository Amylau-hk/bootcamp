public class SuperHuman {
  private double height;

  public SuperHuman() {
    
  }

  // Why abstract class has constructor? but we cannot crrate object for abstract class
  public SuperHuman(double height) {
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }
}
