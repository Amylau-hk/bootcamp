import java.math.BigDecimal;

public class Box { // similar to StringBuilder
  private String x;

  public Box() {
    this.x = "";
  }

  public Box append(String y) {
    this.x += y;
    return this;
  }

  public String toString() {
    return this.x;
  }
 

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb); // hello

    Box box = new Box();
    box.append("hello");
    System.out.println(box);

    BigDecimal bd = new BigDecimal(0.0d);
    // bd.add(BigDecimal.valueOf(1.0d)); 
    // add() -> create new BigDecimal, i.e need to have new object reference (or use the original reference) for it as below
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.0d));
    System.out.println(bd.doubleValue()); // 1.0? No
    System.out.println(bd2.doubleValue()); // 1.0? Yes
  }
  
}
