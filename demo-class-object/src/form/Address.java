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

  public void setLine2(String line2) {
    this.line2 = line2;
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
    Address address = new Address("Flat 101", "Happy house", "Hong Kong");
    Form form = new Form("Amy", "Lau", address);
    System.out.println(form.toString());
    // Form.class -> toString()
    // address果個位會變左做object address

    System.out.println(form); // println() call form.toString()
    // Form.class & Address.class -> toString()
    // Form(Frist name = AmyLast Name = LauAddress = Flat 101Happy houseHong Kong)

    System.out.println(form.getAddress()); // call Address object toString()
    // Flat 101Happy houseHong Kong

    System.out.println(form.getAddress().line2); // private variable, can called in the origainal class ONLY
    System.out.println(form.getAddress().Line2()); // method, can called in other Class

   Form form2 = new Form("Jenny", "Wong", address); // should use new address if do not wanna to change the original one
   // Form form2 = new Form("Jenny", "Wong", new Address("abc", "def", "hij")); 

    System.out.println(form2.getAddress().line2);

    form.getAddress().setLine2("xyz");
    System.out.println(form.getAddress().line2); // xyz

    System.out.println(form2.getAddress().line2); // xyz

    // Why both form address and form2 address was changed to xyz?
    // form.getAddress().setLine2("xyz");
    // this is changing the line2 without open a new object

  }
}
