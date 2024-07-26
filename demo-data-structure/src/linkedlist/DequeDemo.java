package linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {
  public static void main(String[] args) {
    // tube, to pick out and link with left and right
    // using Deque<>, more clear to have First or Last in the method
    Deque<String> strings = new LinkedList<>();
    strings.add("abc"); // same as addLast()
    strings.add("def");
    strings.addFirst("hello");
    strings.addLast("world");
    System.out.println(strings);

    System.out.println(strings.peek()); // same as peekFirst() -> "hello"
    System.out.println(strings.peekFirst()); // hello
    System.out.println(strings.peekLast()); // world


    strings.remove(); // same as removeFirst
    System.out.println(strings); // [abc, def, world]
    strings.removeFirst();
    System.out.println(strings); // [def, world]
    strings.removeLast();
    System.out.println(strings); // [def]

    // Deque interface extends Queue interface
    // so it supports add(), remove(), size() etc

    // ArrayDeque.class
    Deque<String> strings2 = new ArrayDeque<>(); // underlying DS -> array -> fixed length
    strings2.add("abc"); // create new array object and then put the string object into the array.
    strings2.add("def");
    strings2.addFirst("xyz");
    strings2.addLast("xyz");
    strings2.removeFirst();
    strings2.removeLast();
    System.out.println(strings2);

    Queue<String> strings3 = new ArrayDeque<>(); 
    // presenting first-in first-out in the following coding
    strings3.add("apple");
    strings3.add("banana");
    strings3.remove();
    System.out.println(strings3);

    Collection<String> strings4 = new ArrayDeque<>();
    List<String> strings5 = new ArrayList<>(); // most normal use
    strings5.add("abc");
    strings5.add("def");
    strings5.add(1, "apple"); // insert
    System.out.println(strings5); // [abc, apple, def]
    // LinkedList: aboundent index

    // Insertion - ArrayList or LinkedList faster?
    // best/worse case -> LinkedList
    






  }
  
}
