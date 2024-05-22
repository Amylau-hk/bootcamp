import javax.swing.plaf.synth.SynthSplitPaneUI;

public class DemoString {
  public static void main(String[] args) {
    //String stores text
    //double quote to declare a String value
    String x = "hello";
    String y = "!@#$%^&";
    String dollar = "$";

    String withSpace = "  hello      He   llo";
    System.out.println(withSpace);

    // can combine
    String z = x + dollar;
    System.out.println(z);//hello$

    double price = 9.99;
    String item = "Book";
    String description = "The " + item + "costs $" + price;//String + String + double.....->String
    System.out.println(description);

    char a = 'A';
    String message = "The answer is:" + a;//char ->string
    System.out.println(message);

    //String Method(Tool) 1: length()
    String t = "hello";
    System.out.println("The length of t=" + t.length());//t.length() -> int

    //check if t length >= 4, if yes, print hello, else goodbye
    if (t.length() >= 4){
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }

    String q = "seeyou";
    System.out.println("The length" + q.length());

    //Method 2: equals()
    String s1 = "hello";
    String s2 = "hello";
    if(s1.equals(s2)){
      System.out.println("They are having same String value.");
    } else {
      System.out.println("They are not with same value.");
    }

    if (!s1.equals(s2)) {// ! means "NOT"
      System.out.println("They are not with same value.");
    } else {
      System.out.println("They are having same String value.");
    }

    // check if s1 length >= 6 or s1 equals s2

    // OR
    if(s1.length() >= 6 || s1.equals(s2)) {// false|| true -> true
      // for the same outcome
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
    // for the different outcome
    if (s1.length() >= 6){
     //c...
    } else if (s1.equals(s2)){
    //d...
    }

    // AND
    if(s1.length() >= 6 && s1.equals(s2)) {// false && true -> false
      // for the same outcome
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
    if (s1.length() >= 6){
      if (s1.equals(s2)){
        System.out.println("hello");
      }
    }

    //Method 3: chatAt(int index), for example(0)
    String s3 = "world";
    // 0 means the first character
    // 1 means the second character
    // 4 means the 5th character
    System.out.println("The 1st character of s3=" + s3.charAt(0));//w
    System.out.println("The 5th character of s3=" + s3.charAt(4));//d

    System.out.println("The last character of s3=" + s3.charAt(s3.length()-1));

    //System.out.println(s3.charAt(-1));error
    //System.out.println(s3.charAt(5));error

    // check if the last character is d and length > 5, if yes, print yes
    String x2 = "hello world";

    // x2.cahrAt(sx.length()-1) ->character, therefore, use == and '' for character items
    if (x2.charAt(x2.length()-1) == 'd' && x2.length() > 5){
      System.out.println("yes");
    }

    // Method 4: substring(int beginIndex, int endIndex)
    String result = x2.substring(0, 2);// the endIndex will show endIndex-1 character
    System.out.println(result);//he
    System.out.println(x2.substring(0, 5));//hello
    System.out.println(x2.substring(3, 8));//lo wo
    System.out.println(x2.substring(0, 0));//""
    System.out.println(x2.substring(0, 1));//h
    //System.out.println(x2.substring(0, -1));error

    // check if the first three character is "wel", print yes
    String x3 = "welcome";
    // substring()
    if (x3.substring(0, 4).equals("wel")){
      System.out.println("yes");
    }// easier for maintain

    //chain method
    System.out.println(x3.substring(0, 3).length());//3
    System.out.println(x3.substring(0, 3).charAt(1));// 'e'

    // same as System.out.println(x3.substring(0, 3).length());//3
    String x4 = x3.substring(0, 3);
    int l1 = x4.length();
    System.out.println(l1);//3

   // charAt()
   if (x3.charAt(0) == 'w' && x3.charAt(1) == 'e' && x3.charAt(2) == 'l'){
    System.out.println("yes");
   }// not perfer for maintenace

   // isEmpty()
   // Empty String value -> ""
   String x7 = "";
   System.out.println(x7.isEmpty()); // true
   String x8 = "abc";
   System.out.println(x8.isEmpty()); // false

   System.out.println(x7.length() == 0); //true

   // isBlank()
   String x9 = "";
   System.out.println(x9.isBlank()); //true
   x9 = " ";
   System.out.println(x9.isBlank()); //true
   System.out.println(x9.isEmpty()); //false

   // substring(0, 3)
   //substring(0)
   String s10 = "hello";
   System.out.println(s10.substring(0)); // hello, from index 0 to the end.
   System.out.println(s10.substring(0, 3)); //hel, from index 0 to the index 2 (3-1)

   // hello -> HELLO
   System.out.println(s10.toUpperCase()); // "HELLO"
   String s11 = "Hello";
   System.out.println(s11.toLowerCase()); // "hello"

   System.out.println(s10.replace('l', 'x')); // hexxo
   System.out.println(s10.replace("ll", "yyy")); // heyyyo
   // replace item number can be more than the original

   System.out.println(s10.replace("lll", "abc")); // hello

   System.out.println(s10.contains("ell")); //true

   // startsWith()
   System.out.println(s10.startsWith("he")); //true
   // endsWith()
   System.out.println(s10.endsWith("o")); //true

   // trim(), removing the space characters at the head/tail of the String.
   String s12 = "    Hello,  bootcamp  !!!    ";
   System.out.println(s12.trim()); // Hello,  bootcamp  !!!

   String[] strings = new String[] {"hello", "abcijk", "vincent", "HELLO", "..HELLO..."};
   // how many strings contains "ELL", but ignore case
   //"eLL" or "ell" or "ELL"
   int count = 0;
   for (int i = 0; i < strings.length; i++){
    if (strings[i].toUpperCase().contains("ELL")){
      count++;
    }
   }
   System.out.println("Strings count=" + count);

  }
  
}
