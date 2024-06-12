package form;
public class Form {

  private String firstName;
  private String lastName;
  private Address address; // Another class put in the class

  // constructor, getter, setter

  public Form (String firstName, String lastName, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Address getAddress() {
    return this.address;
  }

  public String toString() {
    return "Form(" 
    + "Frist name = " + this.firstName 
    + "Last Name = " + this.lastName 
    + "Address = " + this.address // call this.address.toString()
    + ")";
  }


  
}
