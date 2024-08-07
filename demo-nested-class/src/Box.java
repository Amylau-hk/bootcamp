import java.util.LinkedList;
import java.util.List;

public class Box {
  private List<Ball> balls;
  private int capacity;

public Box() {
  balls = new LinkedList<>();
  this.capacity = 10;
}

public List<Ball> getBalls() {
  return this.balls;
}

  public void add(Ball ball) {
    balls.add(ball);
  }

  public class Ball {
      public int getCapacity() {
        return capacity;
        // not this.capacity, capacity is not the own object of Ball
        // Still can return capacity as it is connect with Box.class
        // however, Box and Ball are still not in Parent relationship
      }
  }
  
}
