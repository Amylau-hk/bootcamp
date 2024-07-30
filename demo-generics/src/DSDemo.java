import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DSDemo {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    // ArrayList.class has Generics design.

    Map<String, Customer> customerMap = new HashMap<>();

    // <E> must be the same type
    // <K, V> can be the same or not the same type
  }
  
}
