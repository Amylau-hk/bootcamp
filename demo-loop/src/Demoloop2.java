public class Demoloop2 {
  public static void main(String[] args) {
    // infinte loop -> control + c to stop
    // for (int i = 0; ; i++){ // No "continue" conition -> No "Exit" condition
      //System.out.println("hello world");
    //}
  //}
  
  //for (;;){ // No "continue" conition -> No "Exit" condition
    //System.out.println("hello");
  //}

  // Label : outerLoop -> labeled start point for "continue"
  outerLoop: for (int i = 1; i <= 3; i++){
    for (int j = 1; j <= 3; j++) {
      if (i == 2 && J ==2){
        continue outerLoop; // skip to the next iteration of the outer loop
      }
      System.out.println("i: " + i + ", j: " + j);
    }
  }
}
