public class Box<T> { // <T> just like unknown & any type , not putting primitives
  private T value;

  public Box() {

  }

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }
  

  public static void main(String[] args) {
    // Run time
    // You have to define the tyep <T> during run-time
    // <T> is a temp waiting for define
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(100); // int -> Integer
    Box<Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer());

    // You cannot use <T> during run-time
    // Box<T> box = new Box<>();
  }

}
