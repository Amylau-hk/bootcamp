public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */


  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int f0 = 0;
    int f1 = 1;
    int result = f0 + f1;
    for (int i = 0; i < 15; i++){
      if ( i == 0){
        result = 1;
      } else {
      result = f0 + f1;
      f0 = f1;
      f1 = result;
      }
      
      System.out.println(result);
      }

      



  }
} 
