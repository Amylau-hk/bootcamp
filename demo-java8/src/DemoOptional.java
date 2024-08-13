import java.util.Optional;

public class DemoOptional {

  public static void main(String[] args) {
    String s = "hello";
    s = null;
    generte(s); // OK

    // method user
    generte(s).charAt(0); // error

    // alternative
    // generate2() -> return Optional<String> -> the return value can be null or not null
    // the java will force to handle potential null scenario during compile-time
    Optional<String> result = generte2(s);
    char target = ' ';
    if (result.isPresent()) { // not null
      target = result.get().charAt(0);
    } else { // null
      target = '_';
    }
    

  }

  // method author
  public static String generte(String s) {
    if (s == null)
      return null;
    return s.replace('a', 'b').toUpperCase();
  }
  
  // 1. Optional<String> != String
  public static Optional<String> generte2(String s) {
   if (s == null)
      return Optional.of(null);
    return Optional.of(s.replace('a', 'b').toUpperCase());
  }

}
