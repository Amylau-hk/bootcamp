public abstract class Person { // abstract
  // public [abstract] class Person :added abstract between public and class, unable to create a new object, is just 藍圖 
  private String name;
  private int age;

  // 繼承common factor

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  public static void main(String[] args) {
    // abstract class CANNOT create object
    // Person p = new Person("Vincent", 13);

    // Student.class is public
    // Student.class constructor is public
    Student s = new Student(1, "Vincent", 13);
  }
}