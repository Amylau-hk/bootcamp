public class Cat { // Class Name -> Name Convention -> able to describe physical object

  // What is "this"?
 // 指定該object = 對應的data 

  // state
  // attributes

  //定義個object include D 咩
  private String name; 
  private int age;

  // if NO constructor is defined,
  // by default the class implicitly has a empty constructor


  // behavior
  // instance method
  // setAge is a method that can be called by object only
  // For example, Cat c1 = new Cat();
  // c1.setAge(13);
  // "this" -> the object pointed by c1 (object reference)

  // void is a return type, requires return nothing
  public void setAge(int age) {
    this.age = age; 
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  // instance method
  public String describe() {
    return "The age of this cat is " + this.age + ", and the name of this cat is " + this.name;
  }

  // static method
  public static String hello() {
    return "hello";
  }

  public static String hello(String s) {
    return s + "!!!";
  }

  public static void main(String[] args) {

    // the purpose of static method -> produce something by the input parameters
    // static method should not access any object attributes / behaviors
    System.out.println(Cat.hello()); // hello
    System.out.println(Cat.hello("goodbye")); // goodbye!!!
    System.out.println(Book.hello());

    
  // how to call describe()
  // instance method is able to access (read & write) the object attributes
  Cat cat = new Cat();
  cat.setAge(13);
  cat.setName("ABC");
  System.out.println(cat.describe()); // The age of this cat is 13, and the name of this cat is ABC
  }

}
