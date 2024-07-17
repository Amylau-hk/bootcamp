import java.math.BigDecimal;

public class StringDemo {
  public static void main(String[] args) {
    String s = "hello";
    s.concat("world"); // concat() method return new String Object (address), no impact to s
    String s2 = s.concat("world");
    System.out.println(s); // hello
    System.out.println(s2); // helloworld
    // s2 is an object reference, helping you to remain the way to find the object

    StringBuilder sb = new StringBuilder("hello");
    sb.append("world"); // You don't have to "save" the address of sb. because you already changed the value stored 
    System.out.println(sb); // helloworld
    // StringBuilder is returning itself, therefore no need to provide a object refernce
    sb.append("!!!!!");
    System.out.println(sb); // helloworld!!!!!

    // As a developer, you have to figure out the impact of each instance method of each Class.

    // BigDecimal
    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 = BigDecimal.valueOf(3.4);
    bd.add(bd2); // you have to worry about the impact on bd. Is bd 6.7?

    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0));
    System.out.println(bd3.doubleValue()); // 6.6
    

  }
  
}
