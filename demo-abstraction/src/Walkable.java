public interface Walkable {
  // Interface:
  // 1. No instance variable
  // 2. all method are "public abstract" implicitly
  // 3. you can still declare "public static final" implicitly
  // 4. A class can implements more than 1 interface, but can only extend one Parent class only

  // Original // public static final int AGE = 3;
  // Constant
  int AGE = 3;

  // Original // abstract voidl walk();
  void walk();
  // cannot new
  // as contract

  // After Java 8, we have default method and static method in interface
  // can be override
  default void run() {
    System.out.println("default I am running");
  }

  static void swim() {
    System.out.println("static I am swimmong");

    // default static void read() {
    //   System.out.println("");
    // }
  }

}
