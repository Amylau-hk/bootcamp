import java.util.LinkedList;
import java.util.List;

public class DemoLambda {
    public static void main(String[] args) {
        Swimable p = new Swimable() {
            @Override
            public void swim() {
                System.out.println("I am swimming");
            }
        };
        p.swim();

        // Lambda expression
        // The reason that we can use "() -> implementation" is that interface contain one abstract only.
       Swimable person = () -> System.out.println("I am swimming...");
       System.out.println(person.toString()); // DemoLambda$$Lambda$1/0x0000019a2b000400@452b3a41
       person.swim();

       // Another object, the address is different
       person = () -> System.out.println("I am Swimming!!!");
       System.out.println(person.toString()); // DemoLambda$$Lambda$2/0x0000019a2b001800@f6f4d33
       person.swim(); 

       // 有參數需要在()中加返reference
       Calculator sumCalculator = (a, b) -> a + b;
       System.out.println(sumCalculator.calculate(10, 3)); // 13
       
       Calculator multiplyCalculator = (a, b) -> a * b;
       System.out.println(multiplyCalculator.calculate(10, 3)); // 30

        // 1. More than one line of implementation, Then you have to use "return" keyword within the implementation block
        // 2. if there is only one parameter, then you dont have to use (x), you can simply use x
        // Drivable father = (x) -> {
        Drivable father = x -> {
            if (x == 3) 
             return false;
            return true;
        };
        System.out.println(father.drive(3)); // false
        System.out.println(father.drive(4)); // true

        
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("abcd");

         // for-each loop
         String t = "";
        for (String s : strings){
            System.out.println(s);
            t += s;
        }
        System.out.println(t); // abcdefabcd

        // Lambda for-each
        strings.forEach(s -> System.out.println(s));

        strings.forEach(s -> {
            if (s.length() > 3) {
                System.out.println(s);
            // } else {
            //     System.out.println("hello");
            }
            // t += s; // compile error, cannot change the 參數 which is outside the box
        });
        // abcd


     }
}
