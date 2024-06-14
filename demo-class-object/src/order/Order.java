package order;

import java.math.BigDecimal;

public class Order {
  
  private static int count;

  private int id;
  private Item[] items; // object ref
  private String coupon;

  public Order(String coupon) {
    this.id = ++count;
    this.items = new Item[0];
  }

  public int getId() {
    return this.id;
  }

  public Item[] getItems() {
    return this.items;
  }

  public String getCoupon() {
    return this.coupon;
  }

  public double getDisount() {
    if (isCouponValid())
    return 0.2d;
    return 0.0d;
  }

  public boolean isCouponValid() {
    return true;
  }

  public void addItem(Item item) {
    Item[] itemsList = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      itemsList[i] = this.items[i];
    }
    itemsList[itemsList.length - 1] = item;
    this.items = itemsList;
  }

  public double total() {
    BigDecimal amount = BigDecimal.valueOf(0L);
    // add, subtract, mutiply, divide methods return new object
    for (int i = 0; i < this.items.length; i++) {
      amount = amount.add(BigDecimal.valueOf(this.items[i].subTotal()));
      // return new BigDecimal(), i.e need to replace the origianl amount
    }
    // Calculate Discount
    amount = amount.multiply(BigDecimal.valueOf(1.0 - getDisount()));
    return amount.doubleValue(); // convert from BigDecimal Object to double primitive value
  }

  public static void main(String[] args) {
    Order order = new Order("ABC");
    Item item = new Item(96.0d, 2);
    System.out.println(item.subTotal()); // 192.0
    order.addItem(item);

    Item item2 = new Item(10.0d, 3);
    order.addItem(item2);
    System.out.println(order.total()); // 222 * 0.8 = 177.6
  }
}
