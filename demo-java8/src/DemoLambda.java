import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

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


        // Function.class
        // R apply(T t)
        Function<String, Integer> stringLength = str -> 3;

        Function<String, Integer> strLen = str -> str.length(); // formula
        System.out.println(strLen.apply("hello")); // 5
        System.out.println(strLen.apply("abc")); // 3

        Function <String, Integer> strLen2 = new StringLength();
        System.out.println(strLen2.apply("hello")); // 5
        System.out.println(strLen2.apply("abc")); // 3

        Function<Customer, Integer> nameLength = customer -> customer.getName().length();

        Function<Customer, String> greetingMessage = customer -> {
            String message = "Hello everyone. I am ".concat(customer.getName());
            return message;
        };
        String message = greetingMessage.apply(new Customer("John"));
        System.out.println(message); // Hello everyone. I am John

        BiFunction<String, String, Integer> nameLength2 = (firstName, lastName) -> firstName.length() + lastName.length();
        // Function vs method
        // Function: able to change the formula using the same object reference
        // method: Need to cread a new static method for a new formula
        System.out.println(nameLength2.apply("Vincent", "Lau")); // 10

        getName("Vincent", "Lau");

        // Consumer
        // public interface Consumer<T> {
        // void accept(T t);
        Consumer<Customer> printCustomerName = customer -> System.out.println(customer.getName());
        printCustomerName.accept(new Customer("Jenny")); // Jenny

        // public interface BiConsumer<T t>
        // void accept(T t, U u);
        // int x = 3;
        MathOperation operation = MathOperation.MULTIPLY;
        BiConsumer<Integer, Integer> calculate = null;
        // switch (x) {
        switch (operation) {
            case SUM:
            calculate = (num1, num2) -> System.out.println(num1 + num2);
                break;
            case SUBTRACT:
            calculate = (num1, num2) -> System.out.println(num1 - num2);
                break;
            case MULTIPLY:
            calculate = (num1, num2) -> System.out.println(num1 * num2);
                break;
            case DIVIDE:
            calculate = (num1, num2) -> System.out.println(num1 / num2);
                break;
        }
        calculate.accept(10, 3);// 30
        // BiConsumer<Integer, Integer> calculate2 = (num1, num2) -> System.out.println(sum(num1, num2));

        // Supplier
        // generate random number
        Supplier<Integer> markSixNumber = () -> new Random().nextInt(49) + 1;
        List<Integer> marksix = new LinkedList<>();
        int ball = -1;
        while (marksix.size() < 6) {
            ball = markSixNumber.get();
            if (marksix.contains(ball))
            continue;
            marksix.add(ball);
            
        }
        System.out.println(marksix);
        // randomNumebr.get();

        // Predicate
        Predicate<Customer> isNameTooLong = customer -> customer.getName().length() > 5;
        System.out.println(isNameTooLong.test(new Customer("Vincent"))); // true
        System.out.println(isNameTooLong.test(new Customer("sam"))); // false

        // BiPredicate
        BiPredicate<String, String> c = (name, ch) -> name.contains(ch);
        System.out.println(c.test("Amy", "A")); // true

        BiPredicate<Customer, String> checkNam = (name2, ch2) -> name2.getName().contains(ch2);
        System.out.println(checkNam.test(new Customer("Abby"), "c")); // false

        BiPredicate<String, String> isNameTooLong2 = (firstName, lastName) -> firstName.length() + lastName.length() > 9;
        System.out.println(isNameTooLong2.test("Vincent", "Lau")); // true


        // UnaryOperator
        // UnaryOperator<String> = Function<String, String>
        UnaryOperator<String> nameFormula = s -> s + "!!!";
        System.out.println(nameFormula.apply("John")); // John!!!

        // BinaryOperator<String> -> Function<String, String, String>
        BinaryOperator<String> nameFormula2 = (s1, s2) -> s1 + " " +s2;
        System.out.println(nameFormula2.apply("Vincent", "Lau")); // Vincent Lau
        

     }

     public static int sum(int x, int y) {
        return x + y;
     }

     public static int getName(String firstName, String lastName) {
        return firstName.length() + lastName.length();
     }
}
