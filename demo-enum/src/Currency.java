public enum Currency {
  HKD("Hong Kong Dollar", 1), // similar to new Currency("Hong Kong Dollar.")
  USD("US Dollar", 2),
  JPY("Yen", 3),
  CNY("人仔", 4),
  NZD("New Zealand Dollar", 5),
  AUD("Australian Dollar", 6),
  ;
  // 只係系統的限制

  // instance variable
  private final String description;
  private final int DBValue;

  // Constructor
  private Currency (String description, int DBValue) {
    this.description = description;
    this.DBValue = DBValue;
  }

  // instance methods, getter
  public String getDescription() {
    return this.description;
  }

  public int getDBValue() {
    return this.DBValue;
  }

  @Override
  public String toString() {
    return "Currency(" //
    + "description = " + this.description //
    + "DBvalue = " + this.DBValue //
    + ")";
  }

  // 2 -> USD, 3 -> JPY
  public static Currency get(int DBValue) {
    for (Currency curr : Currency.values()){
      if (DBValue == curr.getDBValue())
      return curr;
    }
    return null; // throw exception 
  }

  public static int get(Currency currency) {
    return currency.getDBValue();
  }

  public static String fullDescription(Currency currency) {
    // if (currency == Currency.HKD) {
    //   return "It is Hong Kong Dollar.";
    // } else if (currency == Currency.USD) {
    //   return "Hello world";
    // } else if (currency == Currency.JPY) {
    //   return String.valueOf(currency.getDBValue());
    // }
    // return null;

    // Alternative: switch(before java 14) + enum (perfect match)
    switch (currency) {
      case HKD:
      return "It is Hong Kong Dollar.";
      case USD:
      return "Hello world";
      case JPY:
      return String.valueOf(currency.getDBValue());
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    // Currency currency = "HKD";
    Currency currency = Currency.HKD; // check address
    if (currency == Currency.USD) {
      System.out.println("it is " + currency.getDescription());
    } else if (currency == Currency.HKD) {
      System.out.println("it is " + currency.getDescription());
    } else if (currency == Currency.JPY) {
      System.out.println("it is "  + currency.getDescription());
    }

    System.out.println(currency); // "HKD"

    // ENUM already override Object.toString() -> HKD (Before Override on above)
    System.out.println(currency.toString()); // Currency(description = Hong Kong DollarDBvalue = 1) (After Override on above)

    // default instance methods provided by ENUM.class
    // 1. name()
    System.out.println(currency.name()); // "HKD"

    // 2. values() -> for-each loop
    for (Currency c : Currency.values()) {
      System.out.println(c.getDescription());
    }
    //Hong Kong Dollar
    // US Dollar
    // Yen
    // 人仔
    // New Zealand Dollar
    // Australian Dollar 

    System.out.println(Currency.values().length); // 6

    System.out.println(Currency.HKD.hashCode()); // 1927950199
    System.out.println(Currency.USD.hashCode()); // 868693306

    System.out.println(Currency.JPY.equals(currency)); // false
    System.out.println(Currency.HKD.equals(currency)); // true

    System.out.println(currency.equals(Currency.HKD)); // not a good style
    System.out.println(currency != null && currency.equals(Currency.HKD)); // better
    String x = "abc";

    // NOT OK
    if (x.equals("abc")) { // potentially null pointer exception, 
      // "x" is object reference. It may be empty. The program will die when it run.

    }

    // OK
    if ("abc".equals(x)) { // false or true
      // better start with fixed value, it can ensure the compare is compared a fixed things with others
    }

    System.out.println(Currency.get(2)); // toString(), Currency(description = US DollarDBvalue = 2)

    
  // valueOf() -> static method, String -> ENUM, 
  System.out.println(Currency.valueOf("HKD").name()); // "HKD", "HKD" -> Currency enum -> name() -> "HKD"
  // System.out.println(Currency.valueOf("123").name()); // java.lang.IllegalArgumentException
  //唔可以亂放野入去


  }


}
