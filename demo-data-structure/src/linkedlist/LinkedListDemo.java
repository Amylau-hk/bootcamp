package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
  public static void main(String[] args) {
    // array vs ArrayList 
    // 1. Underlying structure of ArrayList is array
    // 2. array -> fixed length -> a range of continous memory locations

    Cat cat = new Cat(Color.BLUE);
    // Heap
    // Step 1: Cat Object
    // Step 2: Eye Array Object
    // Step 3: Two Eye objects
    // Step 4: 3 color objects (created when you execute the main method)

    cat.getEyes(); // cat object -> get Eye Array Object
    cat.getLeftEye(); // Cat object -> Eye Array Object -> Eye object

    Eye[] eyes = cat.getEyes(); // backup the array object memory location
    Eye rightEye = eyes[1]; // access the right eye

    // What is the relationship between the memory location of cat, eyes, rightEye?
    // 1. LeftEye vs Righteye -> nearby
    // 2. Cat object vs Eye[] object
    // 3. Cat object vs eye object

    String[] strings = new String[1000000];

    // Underlying structure in <Node>
    List<String> strings2 = new LinkedList<>();
    strings2.add("A");
    strings2.add("B");
    strings2.add("C");
    strings2.remove("B");
    strings2.remove(0);
    strings2.add("D");
    for (String s : strings2) {
      System.out.println(s);
    }

    // In heap memory
    // LinkedList: Check the object one by one, cannot directly point into the object
    // ArrayList: able to check the object in the direct location

    System.out.println(strings2.isEmpty()); // false
    
    // LinkedList vs ArrayList
    // 1. Underlying data structure
    // 2. No. of Methods Difference (i.e. LinkedList -> addFirst(), removeFirst())

    LinkedList<String> ll = new LinkedList<>();
    ll.add("hello");
    ll.addFirst("abc");
    ll.add("def");
    for (String s : ll) {
      System.out.println(s);
    }
    ll.removeFirst();
    for (String s : ll) {
      System.out.println(s);
    }

    System.out.println(ll.indexOf("hello")); // 0
  }
  
}
