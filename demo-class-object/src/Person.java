import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  // Attributes
  private String firstName;
  private String lastName;
  private double weight;
  private double height;

  // Empty Constructor (default if no defined any constructor)
  public Person() {

  }

  // All Arguements Constructor
  public Person(String firstName, String lastName, double weight, double height) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.weight= weight;
    this.height = height;
  }

  // instance method
  // Attributes Presentation
  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi(){
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height,2)), RoundingMode.HALF_UP)
    .doubleValue() ;
  }

  public String toString() {
    return "Person( firstName = " + this.firstName + " lastName = " + this.lastName + " weight = " + this.weight + " height = " + this.height + ")";
  }


  // getter setter
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setWeigth(double weight){
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public double getHeight(){
    return this.height;
  }
  
    // Convert bmi() to static method
    public static double BMI(double weight, double height) {
      return BigDecimal.valueOf(weight)
      .divide(BigDecimal.valueOf(Math.pow(height,2)), RoundingMode.HALF_UP)
      .doubleValue() ;
    }
  
  public static void main(String[] args) {
    // create a person
    // set last name
    // set first name
    // get fullname

    Person p1 = new Person(); // "new Person()" -> create a Person Object in Memory
    p1.setFirstName("Amy");
    p1.setLastName("Lau");
    System.out.println(p1.fullName());

    p1.setHeight(1.7);
    p1.setWeigth(60.3);
    System.out.println(p1.fullName() + "'s bmi is " + p1.bmi());

    System.out.println(p1.toString());

    System.out.println(Person.BMI(65, 1.7));

    // Create a person object with given attribute values
    Person p2 = new Person("Jenny", "Chan", 55, 1.7);
    System.out.println(p2.fullName());
    System.out.println(p2.bmi()); //19
    p2.setWeigth(54);
    System.out.println(p2.bmi()); //18.7

    Person p3 = p1;
    System.out.println(p1.getFirstName()); // Amy
    System.out.println(p3.getFirstName()); // Amy

  }
}
