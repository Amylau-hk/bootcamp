public class DemoSwitch {
  public static void main(String[] args) {
    char grade = 'B';
    switch (grade){
      case 'A':
      System.out.println("The grade is " + grade);
      break;// break the switch statement
      case 'B':
      System.out.println("The grade is " + grade);
      break;
      case 'C':
      System.out.println("The grade is " + grade);
      break;
      default:
      System.out.println("No grade");
    }

    if (grade == 'A' || grade == 'B' || grade == 'C'){
      System.out.println("The grade is " + grade);
    } else {
      System.out.println("No grade");
    }

    // if you don't use break statement, the ordering of the case may cause various result
    int x = 0;
    switch (grade){
      case 'A':
      x += 10;
      case 'B':
      x += 10;
      case 'C':
      x += 10;
      default:
      x += 10;
    }
    System.out.println("x=" + x);//30
  }
  
}
