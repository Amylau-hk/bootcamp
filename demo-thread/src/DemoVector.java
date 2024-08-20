import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {

  public static void main(String[] args) {
    // ArrayList (non thread-safe, better performance) vs Vector (thread-safe, poor performance)
    List<String> strings = new ArrayList<>();
    // List<String> strings = new Vector<>(); // Solution, change ArrayList<>() to Vector<>()
    // ArrayList implementation differents to Vector implementation
    // Vector:similar with Array[] and with synchronized (process the thread one by one, will not process the threads at the same time)

    Runnable addStringToArrayList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings.add("hello");
      }
      // System.out.println("ArrayList.size=" + strings.size()); // 1_000_000
    }; // run() method implementation

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrayList);
    Thread thread2 = new Thread(addStringToArrayList);
    thread1.start(); // call run()
    thread2.start();

    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayList runtime=" + (afterTime - startTime));
      System.out.println("ArrayList.size=" + strings.size()); // 1000180
    } catch (InterruptedException e) {

    }

    // Solution for Multi-threading
    List<String> strings2 = new Vector<>(); 

    Runnable addStringToVector = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings2.add("hello");
      }
    }; 

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start(); // call run()
    thread4.start();

    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Vector runtime=" + (afterTime - startTime));
      System.out.println("Vector.size=" + strings2.size()); // 
    } catch (InterruptedException e) {

    }

    System.out.println(strings.size()); // 0, NOT OK, main program flow
    System.out.println("Program ends ...");

    // Steps to resize the ArrayList/Array (add element)
    // 1. create a new array (length + 1)
    // 2. copy of the old array to new array
    // 3. Add the new element at the array
    // 4. reassign the new obj to the old obj ref




  }
  
}
