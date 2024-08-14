import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {

  public static void main(String[] args) {
    String s = "hello";
    s = null;
    generte(s); // OK

    // method user
    // generte(s).charAt(0); // error

    // alternative
    // generate2() -> return Optional<String> -> the return value can be null or not null
    // the java will force to handle potential null scenario during compile-time
    Optional<String> result = generte2(s);
    char target = ' ';
    // isPresent() -> return boolean
    if (result.isPresent()) { // not null
      target = result.get().charAt(0);
    } else { // null
      target = '_';
    }
    

    // Ways to create Optional Object
    System.out.println(Optional.of("Hello")); // OK Optional[Hello]
    // Optional.of(null); // NOT OK
    Optional<String> s2 = Optional.ofNullable(null); // OK, Optional.ofNullable 先可以放null
    s2 = Optional.ofNullable("abc"); // OK
    Optional<String> optString = Optional.empty(); // same as Optional.ofNullable(null)
    
    // ifPresent() -> Lambda Expression
    // s is String already, but not Optional<String>
    target = ' ';
    int x = 0;
    generte2("abc").ifPresent(string -> { 
      // target = string.charAt(0); // NOT OK for write
      string.charAt(0); // OK
      System.out.println(x); // OK for Read
    });
    // unable to adjust the object outside the box
    System.out.println("target=" + target);

    // Stream -> findFirst(), findAny()
    List<Customer> customers = Arrays.asList(new Customer("John", 13), new Customer("Jenny", 30), new Customer("Peter", 28));
    Optional<Customer> optCustomer = customers.stream() //
     .filter(customer -> customer.getAge() > 20)
     .findFirst();

     optCustomer.ifPresent(c -> System.out.println(c.toString())); // Customer(Name=Jenny, Age=30)

     customers.stream() //
     .filter(customer -> customer.getAge() > 20)
     .findFirst()
     .ifPresent(c -> System.out.println(c));

     // should not findFirst() and then get() directly
    // customers.stream() //
    //  .filter(customer -> customer.getAge() > 50)
    //  .findFirst() // Optional.ofNullable(null)
    //  .get(); // java.util.NoSuchElementException

     // ways to take out the element from optional object
     // 1. isPresnt()
     // 2. ifPresent()
     // 3. orElse()

     Optional<Customer> optCustomer2 = Optional.of(new Customer("Mary", 21));
     Customer customer = optCustomer2.orElse(new Customer("Susan", 29));
    System.out.println(customer); // Customer(Name=Mary, Age=21)

    // 4. orElseThrow()
    Customer customer2 = optCustomer2.orElseThrow(() -> new RuntimeException());

    // 5. orElseGet()
    Customer customer3 = optCustomer2.orElseGet(() -> new Customer("dummy", -99));

    // 
    Optional<String> optCustomer4 = null;
    // optCustomer4.orElse("hello"); // NPE

    Optional<String> optCustomer5 = Optional.ofNullable(null);
    optCustomer5.orElse("dummy"); // OK

  }

  // method author
  public static String generte(String s) {
    if (s == null)
      return null;
    return s.replace('a', 'b').toUpperCase();
  }
  
  // 1. Optional<String> != String
  public static Optional<String> generte2(String s) {
   if (s == null)
      return Optional.ofNullable(null);
    return Optional.of(s.replace('a', 'b').toUpperCase());
  }

}
