import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    System.out.println(strings); // [abc, def, hello]
    // ordering is not determined by insertion order.

    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("abc");
    list.add("def");
    System.out.println(list);
    // [hello, abc, def], ordering follows the insertion order.

    // add duplicated string value
    boolean hsResult = strings.add("hello"); // HashSet -> not adding duplicated value
    boolean alResult = list.add("hello");

    System.out.println(hsResult); // false
    System.out.println(alResult); // true
    System.out.println(strings); // [abc, def, hello]
    // HashSet have checking the value inside, if there is any duplicate string value, wont be added.
    System.out.println(list); // [hello, abc, def, hello]

    System.out.println(strings.size()); // 3
    System.out.println(strings.remove("abc")); // true
    System.out.println(strings.contains("def")); // true

    String[] arr = new String[] {"abc", "def", "xyz", "def"};

    // Question 1: Remove duplicated value
    HashSet<String> result = new HashSet<>();
    // loop
    for (String s : arr) {
      result.add(s);
    }
    System.out.println(result); // ["abc", "def", "xyz"]


    // Question 2: Find all duplicated value
    HashSet<String> result2 = new HashSet<>();
    ArrayList<String> arrlist = new ArrayList<>();
    for (String s : arr) {
      if (!result2.add(s))
      arrlist.add(s);
    }
    // loop
    System.out.println(arrlist); // ["def"]


  }
  
}
