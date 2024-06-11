package form;
public class Address {
  
  private String line1;
  private String line2;
  private String line3;

  // All arguemnts constructor, getter
  public Address(String line1, String line2, String line3) {
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public String Line1() {
    return this.line1;
  }

  public String Line2() {
    return this.line2;
  }

  public String Line3() {
    return this.line3;
  }

  public String toString() {
    return this.line1 + this.line2 + this.line3;
  }


  public static void main(String[] args) {
    // Create a Form Object, with Address object
    Address a1 = new Address("Flat 101", "Happy house", "Hong Kong");
    Form f1 = new Form("Amy", "Lau", a1);
    System.out.println(f1.toString());
  }
}
