package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import shape.Bird;

// Objectives: learn existing interface
public class Ball implements Comparable<Ball> {
  private int number;
  private Color color;

  public Ball(int number, Color color) {
    this.number = number;
    this.color = color;
  }

  public int getNumber() {
    return this.number;
  }

  @Override
  public int compareTo(Ball ball) {
    // Objectives: provide your own formula to sort the List<Ball>
    // Return Value: 1 or -1
    
    // Example 1: sort by number (descending)
    // You have 2 ball object reference here: ball and this
    // -1 means "move to left" (from left to right)
    return this.number > ball.getNumber() ? -1 : 1;
  }

  @Override
  public String toString() {
    return "Balls(" 
    + "Number = " + this.number
    + ", Color =" + this.color
    + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(10, Color.BLACK));
    balls.add(new Ball(14, Color.WHITE));
    balls.add(new Ball(8, Color.RED));
    System.out.println(balls); 
    // [Balls(Number = 10, Color =BLACK), Balls(Number = 14, Color =WHITE), Balls(Number = 8, Color =RED)]

    // Sort
    // Collections.sort() -> call Loop List<Ball> -> ball.compareTo()
    // During compile time, 
    Collections.sort(balls);
    System.out.println(balls);
    //[Balls(Number = 14, Color =WHITE), Balls(Number = 10, Color =BLACK), Balls(Number = 8, Color =RED)]

  // List<Bird> birds = new ArrayList<>();
  // Collections.sort(birds); // error, Bird.class did not implements Comparable

  // Sort by color? Red -> White -> Black
  }
}
