package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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

  public Color getColor() {
    return this.color;
  }

  @Override
  public int compareTo(Ball ball) {
    // Objectives: provide your own formula to sort the List<Ball>
    // Return Value: 1 or -1
    
    // Example 1: sort by number (descending)
    // You have 2 ball object reference here: ball and this
    // -1 means "move to left" (from left to right)

    if (ball != null && this.number > ball.getNumber()) 
      return -1;
    return 1;

    // return this.number > ball.getNumber() ? -1 : 1;

    // 同一時間只support一個sorting formula
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

    // Approach 1
    Collections.sort(balls); // O(nlogn) -> merge sort
    System.out.println(balls);
    //[Balls(Number = 14, Color =WHITE), Balls(Number = 10, Color =BLACK), Balls(Number = 8, Color =RED)]

  // List<Bird> birds = new ArrayList<>();
  // Collections.sort(birds); // error, Bird.class did not implements Comparable

  // Sort by color? Red -> White -> Black
    // Approach 2
    // Comparator can adjust the formula when the situation is difference by "if else"
    balls.add(new Ball(1000, Color.RED));
    balls.add(new Ball(-8, Color.BLACK));

    int x = 3;
    Comparator<Ball> formula = null;
    if (x >= 3) {
      formula = new BallSortByColor();
    } else {
      // formula = new BallSortByNumber();
    }

    Collections.sort(balls, new BallSortByColor());
    System.out.println(balls); 
    // [Balls(Number = 1000, Color =RED), Balls(Number = 8, Color =RED), Balls(Number = 10, Color =BLACK), 
    // Balls(Number = -8, Color =BLACK), Balls(Number = 14, Color =WHITE)]

  // Sort by color and then number? RED -> White -> Black, if same color, larger number go left



  }
}
