import java.util.Comparator;

public class CustomerSortByAge implements Comparator<Customer>{

  // Age Descending Order
  public static CustomerSortByAge of() {
    return new CustomerSortByAge();
  }

  @Override
  public int compare(Customer a1, Customer a2){
    // -1 reprsents a1 object, 1 represents a2 object
    // -1 mean the object move forward (or move to left)
    // 1 mean the object move backward (or move to right)
    return a1.getAge() > a2.getAge() ? -1 : 1 ;
  }
  
}
