public class DemoString {
  public static void main(String[] args) {
    //String stores text
    String x = "hello";
    String y = "!@#$%^&";
    String dollar = "$";

    String withSpace = "  hello      He   llo";
    System.out.println(withSpace);

    // can combine
    String z = x + dollar;
    System.out.println(z);//hello$
  }
  
}
