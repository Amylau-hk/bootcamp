import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashtable {

  public static void main(String[] args) {
    // Hashtable(thread-safe, poor performance -> synz) vs HashMap (Non thread-safe, better performance)
    Hashtable<String, String> table = new Hashtable<>();

    // put() -> 1_000_000
    // 2 threads
    Runnable addTable1 = () -> {
      for(int i = 0; i < 100_000; i++) {
        table.put(String.valueOf(i), "World"); // put() -> replace the duplicated object
      }
    };

    Runnable addTable2 = () -> {
      for(int i = 100_000; i < 200_000; i++) {
        table.put(String.valueOf(i), "World");
      }
    };
    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addTable1);
    Thread thread2 = new Thread(addTable2);
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("HashTable runtime=" + (afterTime - startTime));
      System.out.println("Table.size=" + table.size());
    } catch (InterruptedException e) {

    }

    HashMap<String, String> map = new HashMap<>();

    // put() -> 1_000_000
    // 2 threads
    Runnable addMap1 = () -> {
      for(int i = 0; i < 100_000; i++) {
        map.put(String.valueOf(i), "World"); 
      }
    };

    Runnable addMap2 = () -> {
      for(int i = 100_000; i < 200_000; i++) {
        map.put(String.valueOf(i), "World");
      }
    };

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addMap1);
    Thread thread4 = new Thread(addMap2);
    thread3.start();
    thread4.start();

    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("HashMap runtime=" + (afterTime - startTime));
      System.out.println("map.size=" + map.size());
    } catch (InterruptedException e) {

    }

    System.out.println("programs end...");

    // null key & null value
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(null, "abc"); // replace entry
    map2.put(3, null);
    System.out.println(map2.size()); // 2

    Hashtable<Integer, String> table2 = new Hashtable<>();
    // table2.put(null, "abc"); // Hashtable -> key cannot be null, otherwise java.lang.NullPointerException
    // table2.put(3, null); // java.lang.NullPointerException
    table2.put(1, "abc");
    table2.put(1, "def");
    System.out.println(table2.get(1)); // def, remove the duplication
    System.out.println(table2.size()); // 1

  }
  
}
