import java.lang.reflect.Array;
import java.util.Arrays;

public class Supermarket {

  private String product;
  private double unitprice;
  private double sellingprice;
  private double quantity;

  public Supermarket(String product, double unitprice, double sellingprice, double quantity) {
    this.product = product;
    this.unitprice = unitprice;
    this.sellingprice = sellingprice;
    this.quantity = quantity;
  }

  public double unitprice() {
    return this.unitprice;
  }

  public double sellingprice() {
    return this.sellingprice;
  }

  public double quantity() {
    return this.quantity;
  }

  public double cost() {
    return this.unitprice * this.quantity;
  }

  public double revenue() {
    return this.sellingprice * this.quantity;
  }

  public String toString() {
    return "Supermarket(" + "Product = " + this.product
    + ", Unit price =" + this.unitprice
    + ", Selling price =" + this.sellingprice
    + ", quantity =" + this.quantity
    + ")";
  }

  public static void main(String[] args) {
    
    String[] product = new String[] {"Water", "Egg", "Milk", "Steak", "Sushi"};
    Supermarket s1 = new Supermarket(product[0], 1.2, 10, 500);
    System.out.println(s1.cost());
    System.out.println(s1.toString());
    System.out.println(s1.revenue());
  }
  
}
