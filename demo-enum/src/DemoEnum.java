public class DemoEnum{

  // constant (finite)
  // Weekday
  public static final String monday = "MONDAY";
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thrusay = "THRUSDAY";
  public static final String friday = "FRIDAY";

  public static void main(String[] args) {
    System.out.println(DemoEnum.monday);

    // What happen in heap memory?
    // Answer: static variable would not point to object
    
    // Before executing the main method, it loads enum class
    System.out.println(Weekday.MONDAY); // sysout -> calling Weekday MONDAY toString()
    // be default Weekday.class already @override toString()
    System.out.println(Weekday.TUESDAY);
    System.out.println(Weekday.WEDNESDAY);
    System.out.println(Weekday.THRUSDAY);
    System.out.println(Weekday.FRIDAY);

    // Other Example?
    // NORTH, WEST, EAST, SOUTH

    Direction d = Direction.EAST;
    if (d == Direction.SOUTH) { // compare object address directly

    }

  }
}