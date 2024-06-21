public class DemoNumber {
  public static void main(String[] args) {
    Integer x = 1; // 1 int value (primitive) -> Integer Object
    System.out.println(x.getClass()); // class java.lang.Integer

    Double d = 2.0; 

    // Integer & Double is brother (Child)
    // Number is parent
    Number n = x; // polymorphism
    // n is object reference
    n = d;

    Number[] numbers = new Number[] {1, 2, 3, 4.0, 4.5, (byte) 1, (short) 3, 4L};
    // Double[] doubles = new Double[] {1, 2, 3, 4.0, 4.5}; // 1, 2, 3 are int, int -> Integer (autobox), int -x> Double
    Double[] doubles = new Double[] {Double.valueOf(1), 4.0, 4.5}; // Double.valueOf() can upcast int -> Double object

    // Integer vs Double (No relationship)
    // int vs double (upcast)

    // For-each
    // for (object type : array object)
    for(Number num : numbers) { // Number is parent
      System.out.println(num);
      System.out.println(num.getClass());
// class java.lang.Integer
// class java.lang.Integer
// class java.lang.Integer
// class java.lang.Double
// class java.lang.Double
    }

  }
  
}
