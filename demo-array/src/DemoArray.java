import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) throws Exception {
        int x1 = 10;
        int x2 = 20;
        int x3 = -3; // -3 -> int value, while x 3 -> variable

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
        char[] c1 = new char[]{'o', 'a', 'k', 'p'};
        char[] c2 = new char[]{'a', 'b', 'f', 't'};
        //4a. result -> "oakpabft"
        //Method 1
        String s2 = "";
        for (int i = 0; i < c1.length; i++){
            s2 += c1[i];
        }
        for (int j = 0; j < c2.length; j++){
            s2 += c2[j];
        }
        System.out.println("char[] = " + s2);
        //4b. result -> "obkt". when even index, get the value from c1, when odd index, get the value from c2
        String s3 = "";

        int length = c1.length > c2.length ? c1.length : c2.length;
        if (c1.length > c2.length){
            length = c1.length;
        } else {
            length = c2.length;
        }

        for (int i = 0; i < length; i++){
            if (i % 2 == 0) {
                s3 += c1[i];
            } else {
                s3 += c2[i];
            }
            }
            System.out.println(s3);

            //4c. result -> "obkta"
            char[] c3 = new char[]{'o', 'a', 'k', 'p', 'a', 'b'};
            char[] c4 = new char[]{'a', 'b', 'f', 't'};
            String s4 = "";
            int length2 = c3.length > c4.length ? c3.length : c3.length;

            for (int i = 0; i < length2; i++){
                if (i % 2 == 0 && i < c3.length){
                    s4 += c3[i];
                } else if (i % 2 == 1 && i < c4.length) {
                    s4 += c4[i];
                }
            }
            System.out.println(s4); //obkta

            //average
            int[] arr6 = new int[] {4, 8, 4};
            int sum = 0;
            int count2 = 0;
            for (int i = 0; i < arr6.length; i++){
              sum += arr6[i];
              count2++;
            }
            System.out.println(sum/count2);

            //swaping in array
            //排序
            int[] arr7 = new int[] {6, 10, -4, 15};
            //swap -4 and 6 -> {-4, 10, 6, 15}
            //backup the data in an new area
            int temp = arr7[2];
            //replace the swap number
            arr7[2] = arr7[0];
            //replace the rest number by backup
            arr7[0] = temp;
            System.out.println(Arrays.toString(arr7)); // [-4, 10, 6, 15]
        

            // Level 1:
            // arr7 -> [-4, 10, 6, 15]
            // move -4 to the tail of the array
            // result [10, 6, 15, -4]

            int t = -1;
            for (int i = 0; i < arr7.length - 1; i++){
                t = arr7[i];
                arr7[i] = arr7[i + 1];
                arr7[i + 1] = t;
            }
             System.out.println(Arrays.toString(arr7)); // [10, 6, 15, -4]

             // Level 2:
             // Move the max element to the tail
             // Now: [10, 6, 15, -4]
             // result [10, 6, -4, 15]

             // 1st round: [6, 10, 15, -4]
             // 2nd round: [6, 10, 15, -4]
             // 3rd round: [6, 10, -4, 15]

             for (int i = 0; i < arr7.length - 1; i++){
                if (arr7[i] > arr7[i + 1]) {
                    // swap
                    t = arr7[i];
                    arr7[i] = arr7[i + 1];
                    arr7[i + 1] = t;
                }
             }
              System.out.println(Arrays.toString(arr7)); // [6, 10, -4, 15]

            //Level 3
            // Sorting -> [-4, 6, 10, 15]
            // Bubble sort
            // for loop
            // nested loop
         for (int i = 0; i < arr7.length - 1; i++) {
            for (int j = 0; j < arr7.length - i - 1; j++) {
                if (arr7[j] > arr7[j + 1]) {
                    t = arr7[j];
                    arr7[j] = arr7[j + 1];
                    arr7[j + 1] = t;
                }
            }
         }
         System.out.println(Arrays.toString(arr7));


         // Swap char value
         String str = "hello"; // swap e and o -> holle
         // convert char[]
         // for loop + charAt()

         char t2 = ' ';
         // Method 1
         char[] arr8 = new char[str.length()];
         for (int i = 0; i < str.length(); i++){
            arr8[i] = str.charAt(i);
         }
         // Alternative
         // arr8 = str.toCharArray(); // ['h', 'e', 'l', 'l', 'o'], only replace for loop
         // or
         // char[] arr8 = str.toCharArray(); // replace declear char[]  and for loop
         
         t2 = arr8[1];
         arr8[1] = arr8[4];
         arr8[4] = t2;
         str = String.valueOf(arr8); // assign a new String value to variable s
         System.out.println(str); // holle

    }
}
