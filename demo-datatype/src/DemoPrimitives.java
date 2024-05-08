public class DemoPrimitives {
  public static void main (String [] args) {
    // number/strings(text)
    //number (integers/decimal)
    //int is a data type that declaring the type of value of x can be stored.
    //int->integer
    int x = 3;
    //右手邊放去左邊
    //int y = 3.5;//y cannot store non-integer number.
    int z = -9;
    int total = x + z; //-6
    System.out.println(total);

    // + - * /
    int y = 8;
    int a = 100;
    int b = 99;
    int c = 5;
    int grandtotal = y / a - b + c * x;
    System.out.println(grandtotal);

    int d = total - 10 + x;
    System.out.println(d);

    int k = a + x * 8;
    System.out.println(k);

    int l = 33 / x;
    System.out.println(l);

    //
    int r = 32 / x;
    System.out.println(r);

    //remainder

    int remainder = 10 % 3;//1
    int divide = 10/3;//3
    System.out.println(remainder);
    System.out.println(divide);

    // % 係除數的餘數
  }
}