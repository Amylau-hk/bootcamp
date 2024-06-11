public class DemoInternalCache {
public static void main(String[] args) {
  Integer i1 = Integer.valueOf(3);
  Integer i2 = 3; // 3 int value -> autobox -> Integer object (heap memory)

  // Internal Cache (For Number)
  i1 = 127; // i1 (object refernce), 127 -> (1st) create Integer Object
  i2 = 127; // i2 (object refernce), 127 -> (2nd) reuse the original Integer Object
  // Rule: from -128 to 127 -> reuse the original object
  // -128 to 127 係常用既object
  System.out.println(i1 == i2); // true (are they same object? not are they same 127)

  Integer i3 = 128; // 128 -> (1st) create Integer Object
  Integer i4 = 128; // 128 -> (2nd) create Integer Object
  System.out.println(i3 == i4); // false (are they they same object?)

  // Important!!!!
  // For Class, you should always compare their objects value by METHOD!!!!!!!!
  System.out.println(i3.compareTo(i4)); // 0 (equal)

  // Float, Double (No Internal Cache in JVM)(因為小數位可以有好多個, 但係int整數係得咁多個)
  Float f1 = 10.12345f; // autobox: float value -> Float Object
  Float f2 = 10.12345f; // autobox: float value -> Float Object
  System.out.println(f1 == f2); //false

  Double d1 = 128.12345d; // autobox: double value -> Double Object
  Double d2 = 128.12345d; // autobox: double value -> Double Object
  System.out.println(d1 == d2); //false

  // Boolean: support Internal cache
  Boolean b1 = true; // autobox: boolean -> Boolean
  Boolean b2 = true; // autobox: boolean -> Boolean
  System.out.println(b1 == b2); // true

  // Character: support Internal cache (-128 to 127)
  Character c1 = 'c'; // autobox: char value -> Character Object
  Character c2 = 'c'; // autobox: char value -> Character Object
  System.out.println(c1 == c2); //true

  Character c3 = '我'; 
  Character c4 = '我'; 
  System.out.println(c3 == c4); // false

  




}  
}
