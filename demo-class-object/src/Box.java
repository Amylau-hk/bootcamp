import java.util.Arrays;
import javax.swing.Box;

public class Box {

  // static variable (belongs to class)
  private static String prefix = "apple";

  private String name;


  // instance variable (belongs to object)
  private String[] strings;

  // public Box(String[] strings) {
  //   this.strings = strings;
  // }

  public Box() {
    this.strings = new String[0];
  }

  public void setName(String name) {
    this.name = Box.prefix.concat("-").concat(name);
  }

  public String getName() {
    return this.name;
  }

  public String[] getStrings() {
    return this.strings;
  }

  public void setString(int index, String s) {
    this.strings[index] = s;
  }

  public void addString(String s) {
    String[] arr = new String[this.strings.length + 1];
    for (int i = 0; i < this.strings.length; i++) {
      arr[i] = this.strings[i];
    }
    arr[arr.length - 1] = s;
    this.strings = arr;
  }

    // 
    public void deleteString(String s) {
      // revise the arr length
      // remove corresponding Strings
  
    }

  public String toString() {
    return "Box (" 
    + "Strings =" + Arrays.toString(this.strings)
    +")"; 
  }
  


  public static void main(String[] args) {
    // Box box = new Box(new String[] {"hello", "abc"});
    Box box = new Box();
    box.addString("hello");
    box.addString("abc");

    System.out.println(Arrays.toString(box.getStrings())); // [hello, abc]
    System.out.println(box); // Box (Strings =[hello, abc])

    box.setString(1, "world");
    System.out.println(box); //Box (Strings =[hello, world])

    box.addString("xyz");
    System.out.println(box); // Box (Strings =[hello, world, xyz])

    System.out.println(box.prefix); // apple

    Box name = new Box();
    name


  }
}
