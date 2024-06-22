public class Student2 extends Person2{
  // Person2.class is Parent, while Student2.class is child
  private String name;
  private int studentId;
  private int age;

  // Constructor -> the process of construting student object
  public Student2(int studentId, String name, int age) {
  // public Student2(String name, int studentId, int age) {
    // calling Parent class constructor...
    // 1. creat Parent Object inside Student Object (heap object)
    super(name, age);
    this.studentId = studentId;
    // this.age = age;
    // this.name = name;
  }

  // public String getName() {
  //   return this.name;
  // }

  public int getStudentId() {
    return this.studentId;
  }

  // public int getAge() {
  //   return this.age;
  // }
  

  public static void main(String[] args) {
    Student2 s = new Student2(1, "Vincent", 13); // Student object in heap menmory
    System.out.println(s.getAge());
    System.out.println(s.getName());
    System.out.println(s.getStudentId());
  }
}
