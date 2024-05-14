public class DemoOperator{
  public static void main(String[] args){
    int x = 3;

    x = x + 1;//4
    System.out.println(x);//String + int -> string

    x++; //same as x + 1;
    System.out.println("x=" + x);//5 //System.out.println("") represent String(text)

    x += 1;//same as x = x + 1;
    System.out.println("x=" + x);//6

    x +=2;//same as x = x +2;
    System.out.println("x=" + x);//8

    ++x;//same as x = x + 1;
    System.out.println("x=" + x);//9

    int y = 4;

    y = y - 1;
    System.out.println("y=" + y);

    y--;
    System.out.println("y=" + y);

    --y;
    System.out.println("y=" + y);

    y -= 1;
    System.out.println("y=" + y);

    //*=, /=
    int p = 4;
    p = p * 2;//8
    p *= 2;//16
    p /= 4;//4
    System.out.println("p=" + p);//4

    //%=
    int z = 10;
    z = z % 3;//1
    int j = 10;
    j %= 3;//1
    System.out.println("z=" + z + ",j=" + j);

    String s = "hello";
    s = s + "world";//helloworld
    s += "!!!";
    System.out.println("s=" + s);//s=helloworld!!!

    //No (**) (//)

    //>, <, >=, <=
    boolean r1 = 10 > 3;//true, asking if 10>3?
    boolean r2 = 4 >10;//true
    boolean r3 = 10 >= 10;//true
    boolean r4 = -9 <= 9;//true
    System.out.println("r1=" + r1);

    // and (&&), or (||)
    boolean r5 = 10 > 3 && 20 >= 20;//true AND true ->true
    boolean r6 = 10 >3 && 4 < 4;//ture AND false -> false

    boolean r7 = 10 >3 || 20 >= 20;//true OR true -> true
    boolean r8 = 10 >3 || 20 < 18;//true OR false ->true
    boolean r9 = 3 > 10 || 20 < 18;//false OR false -> false

    char c10 = 'A';
    char c11 = 'B';
    boolean r10 = c10 == c11;//false, ask if a value is equal to another value, we use "=="
    boolean r11 = 'C' != '0';//true, ask if a value is NOT equal to another value, we use "!="

    boolean r12 = 10 / 2 > 5 * 3;//false


    int n = 3;
    int result = n++ * 3;// origianl n mutiply 3 first, assign 9 to result, then n = n + 1;
    System.out.println(result);//9
    System.out.println(n);//4

    int m = 4;
    int result2 = ++m * 5;// m = m + 1 first, the mutiply 5, assign 25 to result 2
    System.out.println(result2);//25
    System.out.println(m);//5

    int k = 4;
    int result3= k++ * 7 * ++k;// 168 = (4 * 7) * 6
    System.out.println(result3);


    }


  }