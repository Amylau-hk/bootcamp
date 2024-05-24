public class DemoMethod {
    public static void main(String[] args) {

        // Method: you put something into the box, and then it return something to you.
        //Calling method
        System.out.println("Hello, World!");


        // Call method (sum)
        int result = sum(10, 3);
        System.out.println("result=" + result); // 13

        System.out.println(lastChar("hello")); //o

        char[] arr = new char[] {'a', 'b', 'c'};
        System.out.println(arr); //abc

        System.out.println(max(new int[] {3, 10, 7})); //10

        System.out.println(isSubstring("hello", "ll")); //true

    }

    // public static int(which is the type you want to show) sum(Name)(參數)
    public static int sum(int x, int y){
        //if your method is with return type, the method should content a key word "return"
        return x + y; // int + int -> int
    }

    public static char lastChar(String s){
        return s.charAt(s.length() - 1);
    }

    public static String toString(char[] arr){
        // Approach 1:
       // String result = "";
        //for (int i = 0; i < arr.length; i++) {
        //    result += arr[i];
        //}
        //return result;

        // Approach 2:
        return String.valueOf(arr);
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max)
            max = arr[i];
        }
        return max;
    }

    public static boolean isElderly(int age){
        // >65
        //Approach 1:
        //if (age > 65) {
        //    return true;
        //}
        //return false;

        //Approach 2: (only applicable in 1 or 2 conditional situations)
        return age > 65;

    }

    public static boolean isSubstring(String str, String substr){
        // check if substr is a substr of str

        //Approach 1:
        //return str.contains(substr);

        //Approach 2:
        // indexOf() method returns an int index, which is the index position substring
        // if it return -1, means not exists.
        //return str.indexOf(substr) != -1;

        //Approach 3: (not must)
        for (int i = 0; i < str.length() - substr.length() + 1; i++){
            for (int j = 0; j < substr.length(); j++) {
             if (str.charAt(i + j) != substr.charAt(j)){
              break;
             }
             if ( j == substr.length() - 1){
                return true;
             }
            }
        }
        return false;
    }

// Java -> PI
    public static double circleArea(int radius){

    }
}
