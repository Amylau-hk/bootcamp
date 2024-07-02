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
   return this.value / direction.getValue() == -1;

    }

  

  public static void main(String[] args) {
    // Direction -> class/ enum
    // Direction.EAST -> object
    System.out.println(Direction.EAST.isOpposite(WEST));
    System.out.println(Direction.NORTH.isOpposite(EAST));
    System.out.println(Direction.SOUTH.isOpposite(NORTH));
  }
}
