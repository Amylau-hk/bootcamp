package marksix;

import java.util.Objects;

public class Smallball extends Ball{
  private String color;

  // constructor
public Smallball(String color, int number) {
  super(number);
  this.color = color;
}

public String getColor() {
  return this.color;
}

  // toString()? equals()? hashCode?
  @Override
  public String toString() {
    return "SmallBall(" 
    + "color=" + this.color
    +", " + super.toString()
    +")";
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) 
    return true;
    if (!(obj instanceof Smallball))
    return false;
    Smallball smallBall = (Smallball) obj;
    return Objects.equals(this.color, smallBall.getColor())
    && Objects.equals(this.getNumber(), smallBall.getNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color, super.getNumber());
  }

  public static void main(String[] args) {
    Smallball b1 = new Smallball("RED", 1);
    Smallball b2 = new Smallball("ORANGE", 2);
    Smallball b3 = new Smallball("ORANGE", 2);
    System.out.println(b2.equals(b3)); // true

    System.out.println(b1.hashCode()); // 2512241
    System.out.println(b2.hashCode()); // -491638955
    System.out.println(b3.hashCode()); // -491638955

    System.out.println(b1.toString());
    System.out.println(b2.toString());
    System.out.println(b3.toString());



  }
}
