public class Book1 {
  private double price;
  private String author;

  public Book1(double price, String author) {
    this.price = price;
    this.author = author;
  }

  // Type of instance method
  // getter, setter
  public double getPrice() {
    return this.price;
  }

  // presentation -> defintion, String.substring
  public boolean isTooExpensive() {
    return this.price > 100;
  }

  // transform (replace) -> return new object



  public static void main(String[] args) {
    Book book = new Book(99.9, "John");
    Book book1 = new Book(99.9, "John");
    Book book2 = new Book(101, "Vincent");
    System.out.println(book.price()); // 99.9
    System.out.println(book.author()); // "John"
    // System.out.println(book.price); // private

    // equals()
    System.out.println(book.equals(book1)); // true
    System.out.println(book.equals(book2)); // false

    // hashCode()
    System.out.println(book.hashCode() == book1.hashCode()); // true
    System.out.println(book.hashCode() == book2.hashCode()); // false

    // toString()
    System.out.println(book.toString()); // Book[price=99.9, author=John]
    System.out.println(book2.toString()); // Book[price=101, author=Vincent]


  }

  
}
