public class Person2 {
  private String name;
  private int age;

  public Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
  

  public static void main(String[] args) {
    Person2 p = new Person2("Vincent", 13);

    // Student.class is public
    // Student.class constructor is public
    Student2 s = new Student2(1, "Vincent", 13);
  }
}
