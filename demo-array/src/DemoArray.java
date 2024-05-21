import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) throws Exception {
        int x1 = 10;
        int x2 = 20;
        int x3 = -3;

        //When you create an array object, you have to define the length of it
        int[] arr = new int[3]; // stores in value only, and the length = 3
        // arr[index]
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = -3;

        //Compile-time Exception
        //arr[0] = "hello"; // Java Compiler knows that "arr" is an int arrau, which stores int value
        System.out.println(arr[0]); //10
        System.out.println(arr[1]); //20
        System.out.println(arr[2]); //-3

        arr[1] = 100;
        System.out.println(arr[1]); //100

        //Run-time Exception
        //arr[3] = 200; // java.lang.arrayIndexOutOfBoundException: Index 3 out of bounds for length 3

        int[] arr2 = new int[] {10, 20, -3};
        System.out.println(arr2[0]); //10
        System.out.println(arr2[1]); //20
        System.out.println(arr2[2]); //-3

        //String array -> "hello", "abc", "aaa"
        //print all 3 String values
        String[] arr3 = new String[] {"hello", "abc", "aaa"};
        System.out.println(arr3[0]); 
        System.out.println(arr3[1]); 
        System.out.println(arr3[2]); 

        String[] strings = new String[] {"hello", "abc", "aaa"};

        byte[] bytes = new byte[] {2, 3, 4};
        long[] values = new long[] {2, 3, 4};
        double[] d1 = new double[] {2.0, 3.0, 4};

        //Arrays
        System.out.println(Arrays.toString(strings)); //[hello, abc, aaa]
        System.out.println(Arrays.toString(arr2)); //[10, 20, -3]

        //9, -3, -100, 90, 66, -4
        //for loop, print out all
        int[] arr4 = new int[] {9, -3, -100, 90, 66, -4};
        for (int i = 0; i < arr4.length; i++){
            System.out.println(arr4[i]);
        }

        //loop
        // find the max value from arr4
        int max = Integer.MIN_VALUE; // the min. value of int
        for (int i = 0; i < arr4.length; i++ ){
            if (arr4[i] > max){
                max = arr4[i];
            }
        }
        System.out.println("max=" + max);

        //find the min. value from arr4
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr4.length; i++){
            if (arr4[i] < min){
                min = arr4 [i];
            }
        }
        System.out.println("min=" + min);

        //
        char[] arr5 = new char[] {'l', 'e', 'e', 'r', 'q'};
        //1. count the number of 'e'
        int count = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] == 'e'){
                count++;
            }
        }
        System.out.println("The number of character e=" + count);
        //2. boolean result to store if 'r' exist
        boolean isrExist = false;
        for (int i = 0; i < arr5.length; i++){
            if (arr5[i] == 'r') {
                isrExist = true;
                break;
            }
        }
        System.out.println("Does character r exist?" + isrExist);
        //3. String result to store "qreel"
        String s1 = "";
        for (int i = arr5.length - 1; i >= 0; i--) {
            s1 += arr5[i];
        }
        System.out.println("Reverse char[] = " + s1);
        //4. Given 2 char[], result -> append all character to a String value
        char[] c1 = new char[]{'o', 'a', 'k'};
        char[] c2 = new char[]{'a', 'b', 'f'};
        //4a. result -> "oakabf"
        //4b. result -> "obkt". when even index, get the value from c1, when odd index, get the value from c2


    }
}
