import java.util.HashMap;

public class HKID {
  private String value;

  public HKID(String value) {
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }  

  public String toString() {
    return "HKID("
    + "value=" + this.value
    + ")";
  }

  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567", 34, "John"
    // "H2345678", 18, "Jenny"
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    HKID hkid = new HKID("H2345678");
    Customer customer = new Customer(18, "Jenny");
    customerMap.put(hkid, customer);
    System.out.println(customerMap);

    // duplicated key
    // put one more customer with same key -> "A1234567", 34, "John"
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    System.out.println(customerMap); // 3 entries. Why?
    

  }
}
