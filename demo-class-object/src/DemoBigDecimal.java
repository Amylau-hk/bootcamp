import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    
    double x = 0.2;
    double y = 0.1;
    System.out.println(x * y); // 0.020000000000000004

    BigDecimal b1 = new BigDecimal("0.2");
    BigDecimal b2 = new BigDecimal("0.1");

    BigDecimal b3 = b1.multiply(b2);
    System.out.println(b3.doubleValue()); //0.02

    System.out.println(sum(0.2, 0.1)); // 0.3
    System.out.println(0.2 + 0.1); // 0.30000000000000004

    // Divide
    //method
    System.out.println(divide(33, 3)); // 11
    System.out.println(divide(9.9, 3.2)); // 3.09375
    System.out.println(divide(10, 3)); // 3.4

    // subtract().multiply()

    System.out.println(BigDecimal.valueOf(3.3).subtract(BigDecimal.valueOf(1.1).add(BigDecimal.valueOf(4.4)))); // 6.6
    System.out.println(BigDecimal.valueOf(3.3).subtract(BigDecimal.valueOf(1.3).multiply(BigDecimal.valueOf(2.0))));


  }
  public static double divide(double d3, double d4){
    BigDecimal b3 = BigDecimal.valueOf(d3);
    BigDecimal b4 = BigDecimal.valueOf(d4);
    // handle non-terminating decimal expansion (i.e. 10 / 3)
    return b3.divide(b4, RoundingMode.UP)
    // decimal place, the way to round the result
    .setScale(3, RoundingMode.UP)
    // convert from BigDecimal to double
    .doubleValue();
  }

  public static double dividetwo(double d1, double d2){
    return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2), RoundingMode.UP).setScale(3, RoundingMode.UP).doubleValue();
  }

  public static double sum(double d1, double d2){
    BigDecimal b1 = BigDecimal.valueOf(d1);
    BigDecimal b2 = BigDecimal.valueOf(d2);
    return b1.add(b2).doubleValue();
  }
  
}
