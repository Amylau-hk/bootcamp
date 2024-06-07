public class Ball {
  private double weight;
  private String color;
  private int number;

  // Constructors - empty constructor, all args constructor
  // by default, there is an empty constructor implicitly exists in the class.
  // public Ball() {

  //}

  // Custom empty constructor
  public Ball() {
   this.color = "Red";
  }

  public Ball(double weight, String color) {
    this.weight = weight;
    this.color = color;
  }

  public Ball(double weight, String color, int number) {
    //this.weight = weight;
    //this.color = color;
    this(weight, color); // call self constructor which have been set before
    this.number = number;
  }

  // duplicated constructor
  // public Ball(double weight, String color) {

  //}
  // unable to find which constructor is calling
  // therefore, cannot the set the constructor with same setting

  public Ball(String color, double weight) {
    this.weight = weight;
    this.color = color;
  }

  public Ball(String color, String color2) {
    this.color = color;
  }

  // getter, setter

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
  // toString
  public String toString() {
    return "Ball( " + "weight = " + this.weight + ", color = " + this.color + ")";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(); // empty constructor to create a ball object
    System.out.println(b1.getColor());

    Ball b2 = new Ball(10.2, "Black"); // all arguments constructor
    System.out.println(b2.getColor()); // "Black"
    System.out.println(b2.getWeight()); // 10.2

    // After replacing the toString() method,
    // Ball@5acf9800 -> Ball( weight = 10.2, color = Black)
    System.out.println(b2.toString()); // Ball@5acf9800 (object reference)
  }
}
