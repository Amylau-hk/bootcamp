import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Accounting {

  private double revenue;
  private double expense;
  private String[] revenueItem;
  private String[] expenseItem;

  public void setRevenue(double revenue) {
    this.revenue = revenue;
  }

  public double Revenue() {
    return this.revenue;
  }

  public void setExpense(double expense) {
    this.expense = expense;
  }

  public double Expense() {
    return this.expense;
  }

  public void setRevenueItem(String[] revenueItem) {
    this.revenueItem = revenueItem;
  }

  public String[] RevenueItem() {
    return this.revenueItem;
  }

  public void setExpenseItem(String[] expenseItem) {
    this.expenseItem = expenseItem;
  }

  public String[] ExpenseItem() {
    return this.expenseItem;
  }

  public double Netprofit() {
    return this.revenue - this.expense;
  }

  public double Netprofitpercentage() {
    return BigDecimal.valueOf(Netprofit())
    .divide(BigDecimal.valueOf(this.revenue), 2, RoundingMode.HALF_UP)
    .doubleValue();
  } 

  public String toString() {
    return "Accounting(" + "Revenue Item = " + Arrays.toString(revenueItem) 
    + ", Revenue =" + this.revenue
    + ", Expense Item = " + Arrays.toString(expenseItem) 
    + ", Expense = " + this.expense
    + ")";
  }

public static void main(String[] args) {
  Accounting a1 = new Accounting();
  a1.setRevenue(100000.1);
  a1.setExpense(2001.1);
  System.out.println(a1.Netprofit());
  System.out.println(a1.Netprofitpercentage()*100 + "%");

  String[] revenueItem = new String[] {"Food", "Beverage", "Service Charge"};
  String[] expenseItem = new String[] {"Salary", "Rent", "Cost of food", "Cost of Beverage"};
  a1.setRevenueItem(revenueItem);
  a1.setExpenseItem(expenseItem);
  System.out.println(a1.toString());


}
  
}
