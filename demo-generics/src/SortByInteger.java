import java.util.Comparator;

public class SortByInteger implements Comparator<Integer>{

  @Override
  public int compare(Integer p1, Integer p2){
    return p2.compareTo(p1);
    // ><= only use in primitives
  }
}
  

  

