public class Demointeger {
    public static void main(String[] args) {
        int x = 1;
        Integer x2 = 1;
        System.out.println(x);
        System.out.println(x2);

        x = x + 3;
        x -= 10;

        x2 = x2 + 3;
        x2 -= 10;

        // Integer is a wrapper class
        // class has method
        short s = (short) x;

        x2 += 60000;
        short s2 = x2.shortValue(); // overflow // similar to explicit conversion
        System.out.println(s2); 

        double d1 = x2.doubleValue();
        System.out.println(d1); //59994

        // Comparsion (>, <, >=, <=, ==, != for primitive value only)
        // For Integer (wrapper class comparsion), compareTo()
        Integer x3 = 4;
        Integer x4 = 8;
        Integer x5 = 8;
        boolean result = x4 > x3; // true (compare int value)

        System.out.println(x4.compareTo(x3)); //1
        System.out.println(x3.compareTo(x4)); //-1
        System.out.println(x4.compareTo(x5)); //0

        // compareTo 係會return int, i.e 下面可以用返>, <, >=, <=, ==, != 去return true or false

        boolean result2 = x4.compareTo(x3) > 0; // true // compare Integer value
        boolean result3 = x4.compareTo(x3) < 0; // false
        boolean result4 = x4.compareTo(x5) == 0; //true




        // +-*/><>=<===!= 都係primitive
        // Wrapper class, 要用function 

        //Byte, Short, Integer, Long, Double, Float
        Float f1 = 10.0f; // 10.0f is a float value(Primitive) -> autobox -> Float value (wrapper  class)
        Float f2 = new Float(10.0); // create Float object, storing a float value
        long l2 = f2.longValue();

        Double d3 = new Double("10.3");
        long l3 = d3.longValue();
        System.out.println(l3); //10

        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b'); // static method
        System.out.println(c2); // 'B'
        System.out.println(Character.toLowerCase('M')); // 'm'

        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);

        // comapreTo() method is used to compare the boolean value stored in Boolean object.
        System.out.println(b3.compareTo(b4)); // -1(which is mean false)
        System.out.println(b4.compareTo(b5)); // 0

        System.out.println(b3 == b4); // false
        System.out.println(b5 == b4); // false ??!!

        // autobox and unbox
        // autobox
        Integer i7 = 9; // 9 is an int value -> autobox -> Integer object
        //當
        // unbox
        int i8 = i7; // i7 is Integer object -> inbox -> int value

        // autobox的original step
        Integer i9 = new Integer(9);
        int i10 = i9.intValue();

        Integer i11 = Integer.valueOf(9); // static method, the result is as same as "new Integer(9)"(兩個有memory既分別)
        
        int i12 = Integer.parseInt("10");
        System.out.println(i12); //10

        //int i13 = Integer.parseInt("10a"); // java.lang.NumberFormatException
        //System.out.println(i13); // run time error

        System.out.println(new Byte("10"));
        //System.out.println(new Byte(10)); // unable to declare 10 to be byte directly, need to add (byte) for declare, as below
        System.out.println(new Byte((byte) 10));



    }
}
