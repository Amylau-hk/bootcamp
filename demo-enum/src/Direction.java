public enum Direction {
  NORTH(2),
  WEST(-1),
  EAST(1),
  SOUTH(-2),
  ;

  // Advantage: able to present some relationship among the enum objects

  private int value;

  private Direction (int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public boolean isOpposite(Direction direction) {
  //  return this.value / direction.getValue() == -1;
    return this.value == direction.getValue() * -1;
  }

  public static boolean isOpposite(Direction d1, Direction d2) {
    return d1.getValue() == d2.getValue() * -1;
  }

  public Direction opposite() {
    for (Direction direction : Direction.values()) {
      if (this.value == direction.getValue() * -1)
      return direction;
    }
    return null;
  }

  public static Direction opposite(Direction direction) {
    for (Direction d : Direction.values()) {
      if (d.getValue() == direction.getValue() * -1) 
      return d;
    }
    return null;
  }
  

  public static void main(String[] args) {
    // Direction -> class/ enum
    // Direction.EAST -> object
    System.out.println(Direction.EAST.isOpposite(WEST)); //false
    System.out.println(Direction.NORTH.isOpposite(EAST)); //true
    System.out.println(Direction.SOUTH.isOpposite(NORTH)); //true
    System.out.println(Direction.SOUTH.opposite()); // NORTH
    System.out.println(Direction.WEST.opposite()); // EAST

    // static method
    System.out.println(Direction.isOpposite(Direction.EAST, Direction.WEST)); // true
    System.out.println(Direction.isOpposite(Direction.EAST, Direction.NORTH)); // false
    System.out.println(Direction.opposite(Direction.SOUTH)); //NORTH
    System.out.println(Direction.opposite(Direction.WEST)); //EAST

  }
}
