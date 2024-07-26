package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    // Can use List<> in the left hand side when the right is LinkedList or ArrayList
    // However, when using List<> in the left, it cannot access all method of LinkedList or ArrayList
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

    ll.add("hello");
    System.out.println(ll.lastIndexOf("hello")); // 2

    // Queue.class
    Queue<String> emails = new LinkedList<>();
    emails.add("john@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails.size()); // Collection.class

    // Poll(), poll out string will no more exist in the class
    String head = emails.poll(); // remove and return the first element in queue
    System.out.println(head); // john@gmail.com
    emails.add("sally@hotmail.com");
    emails.add("dicky@yahoo.com.hk");

    String lookup = emails.peek(); // return the first element in queue 
    System.out.println(lookup); // peter@gmail.com

    // remove()
    emails.remove(new String("dicky@yahoo.com.hk"));
    // LinkedList.class removed(object) ->> For loop
    
    System.out.println(emails); // [peter@gmail.com, sally@hotmail.com]
    emails.remove(); // same as poll()

    // for-each
    for (String s : emails) {
      System.out.println(s);
    }

    // Queue mainly using while-loop  

    // Convert Queue<String> to List<String>
    List<String> strings4 = new ArrayList<>();
    

    while (!emails.isEmpty()) { // isEmpty()
      // System.out.println(emails.poll());
      strings4.add(emails.poll());
    }
    System.out.println(strings4);
    System.out.println(emails); // after while loop, aa elements are removed.
 
    // clear()
    strings4.clear(); // Clear all the object inside the ArrayList object
    strings4.add("abc"); // still can add back object into the ArrayList
    strings4 = null; // remove the ArrayList object, unable to add object into the ArrayList
    // strings4.add("def"); // NPE (null pointer exception)

    // Queue: not expected to pick out the object in the middle of the List (LinkedList)
    


  }
  
}
