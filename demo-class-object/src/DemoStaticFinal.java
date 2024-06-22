public class DemoStaticFinal {

  // coding 排位
  // 1. static method
  // 2. instance method

  // Constant (常量) // snakecase // All Capital letter
  // logoString // camelcase(駝峰)
  private static final String LOGO_STRING; // static(class) vairables, finalized
  private static String name; // static(class) variables

  private static final double PI = Math.PI; // Math.PI -> public static final double PI

  private final double salary = 0.0d; // finalized instance variables

    // final is a java keyword. Compiler would check all final variables have been initialized(初始化).
  // private final double salary;
  // private static final String;
  // unable to compile as it need initial variable for the final

  // camelcase
  private int age; // Instance variables

  // triggered before main() method
  // i.e it can initialized the final variable here.
  static {
    LOGO_STRING = "default";
  }

  public int getAge() {
    return this.age;
  }

  public double getSalary() {
    return this.salary;
  }

  // instance method can access both instance and static variable
  public String test() {
    return this.age + " " + name + " " + this.salary + " " + LOGO_STRING;
  }

  public static String getName() {
    return name;
  }

  public static String getLogo() {
    return LOGO_STRING;
  }

  // able to have setter if the item is not finalized


  public static void main(String[] args) {
    // Instance variables
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age = 10;
    // dsf.salary = 1000; // compile error, salary is a final variable.
    // the salary is finalized as above as 0.0, it is unable to change the value of the finalized item
    System.out.println(dsf.salary); // 0.0
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf2.age = 20;
    System.out.println(dsf2.salary); // 0.0

    System.out.println(DemoStaticFinal.LOGO_STRING); // default

    DemoStaticFinal.name = "Vincent";

    // You cannot assign "static final" variable in main() method, its too late.
    // LOGO_STRING = "default";
  }


}