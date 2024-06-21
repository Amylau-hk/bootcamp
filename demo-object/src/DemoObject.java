import java.util.Scanner;

public class DemoObject {

  public static void main(String[] args) {
    // getClass()
    // 
    StringBuilder sb = new StringBuilder(); // java.lang.StringBuilder

    Scanner scanner = new Scanner(System.in); // java.util.Scanner

    Object object = new Object(); // Object is a super parent 萬能指針, 可以指任何的object
    object = "abc";
    object = Double.valueOf(13);
    object = new Cat();

    object.toString();
    // All Classes extends Object.class. Inherit all methods from Object.class
    System.out.println(new Cat().toString()); // I am a cat
    System.out.println(new Dog().toString()); // Dog@3b9a45b3
    // if not override the object, it will only show the object address instead of the return type

    // Object.hashCode() indentify the object whether the same object
    Cat c1 = new Cat();
    System.out.println(c1.hashCode()); // generate an value by object reference -> 1989780873
    Cat c2 = new Cat();
    System.out.println(c2.hashCode()); // 1480010240


    String x1 = new String("abc");
    System.out.println(x1.hashCode()); // 96354
    String x2 = new String("abc");
    System.out.println(x2.hashCode()); // 96354

    MiniCat mc = new MiniCat("John", "RED");
    MiniCat mc2 = new MiniCat("John", "RED");
    MiniCat mc3 = new MiniCat("Peter", "RED");

    System.out.println(mc.hashCode()); // 71832679
    System.out.println(mc2.hashCode()); // 71832679
    System.out.println(mc3.hashCode()); // -1907721274




  }

  // Java: Ensure Type Safty during compile tiem 
  // public static Object sum(Object x, Object y) {
  //   return x + y; // "+" operations -> String, Integer, int, Double, double, etc...
  //   // unable to defind type to process the above code
  // } // compile error

  public static int length(String x) {
    return x.length();
  }
  
  // During compile time , Compiler cannot ensure the object in heap is a String object
  // public static int length(Object x) {
  //   return x.length();
  // } // compile error
}