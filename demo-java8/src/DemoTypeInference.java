import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {

  public static void main(String[] args) {
    
    // int x = 3;
    // declaration
    int x;
    // assignment
    x = 3;

    var y = 3; // compile time -> int y = 3;
    // y = "hello"; // error
    // y = 3.0; // error

    var z = "hello";
    // z = 3.0; // error

    var k = new Customer("John");
    k = new Customer("Mary");
    // k = 3; // error

    List<Customer> customers = Arrays.asList(new Customer("Benny"), new Customer("Alden"));
    for (var customer : customers) {

    }

    // NOT support
    // var age; // compile force the initialization togther with declaration



  }

  // Not support var for attribute
  // public static class Example {
  //   var x;
  // }

  // NOT support
  // Polymorphism -> method signature is determined during compile time
  // public static int sum(var x, var y) {
    // return x + y;
  // }

  // public static var sum(int x, int y) {
    // return x + y;
  // }
}