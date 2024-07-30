public class StringBox {
  private String value;

  public StringBox() {

  }
  
  public StringBox(String value) {
    this.value = value;
  }
  
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static void main(String[] args) {
    StringBox box = new StringBox("abc");
    System.out.println(box.getValue()); // abc

    new StringBox(1);
  }

}
