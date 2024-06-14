package order;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
  private double price;
  private int quantity;


  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double subTotal() {
    return this.price * this.quantity;
    // return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity), RoundingMode.HALF_UP);
  }

}
