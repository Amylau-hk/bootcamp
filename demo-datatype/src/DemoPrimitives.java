public class DemoPrimitives {
  public static void main (String [] args) {
    // number/strings(text)
    //number (integers/decimal)
    //int is a data type that declaring the type of value of x can be stored.
    //int->integer
    int x = 3;
    //右手邊放去左邊
    //int y = 3.5;//y cannot store non-integer number.
    int z = -9;
    int total = x + z; //-6
    System.out.println(total);

    // + - * /
    int y = 8;
    int a = 100;
    int b = 99;
    int c = 5;
    int grandtotal = y / a - b + c * x;
    System.out.println(grandtotal);

    int d = total - 10 + x;
    System.out.println(d);

    int k = a + x * 8;
    System.out.println(k);

    int l = 33 / x;
    System.out.println(l);

    //
    int r = 32 / x;
    System.out.println(r);

    //remainder

    int remainder = 10 % 3;//1
    int divide = 10/3;//3
    System.out.println(remainder);
    System.out.println(divide);

    // % 係除數的餘數

    //2024.05.10
    //Primitive:double
    double d1 = 10.3;
    //must start with letter, cannot be number
    double d2 = 10.34567;
    double d3 = -110.999;

    double result2 = d1 + d2 - d3;
    System.out.println(result2);// double -> +,-,*,/ will issue in some scenario

    double result3 = 0.1 + 0.2;
    System.out.println(result3);

    double result4 = 2 + 4 * 0.25 * 3 /2 -10;
    System.out.println(result4);
    //most scenario can be control and in +-*/

    int f1 = 7;
    double f2 = 8.8;

    //int f3 = f1 + f2;
    //error, because int(7) + double(8.8) -> double(7.0) + double(8.8) -> double(15.8)
    //so double value can be stored in an int variable
    
    int g = 10 / 3;//int / int -> int -> 3, so 3 can be assigned to variable g

    //Primitives: char
    char c1 = '!'; //single quote to declare a char value
    char c2 = ' ';//space value
    //char c3 = '';//error, char variable must contain a single character, ''中間一定要有字原
    //char c4 = 'aa';//must only one character

    //Primitive:boolean -> ture, false
    //boolean b1 = "true";//you cannot assign a string value to boolean
    boolean b2 = true;
    boolean b3 = false;
    //boolean b4 = 1;cannot assign value

    //Primitives for Integer
    //int, long, byte, short
    byte y1 = 1;
    //byte can only store the integer with range of the value between -128 and 127(2^x)
    byte y2 = -128;
    byte y3 = 127;
    byte y4 = 129; //compile error (java can identify the syntax error)

    short s1 = -32768; //-32768 to 32767
    int i1 = -2147483648;//-2147483648 to 2147483647
    //int i2 = -2147483649;error
    long l1 = -9223372036854775808L;//-9223372036854775808 -> int
    //-9223372036854775808 to 9223372036854775807
    //L means a way to to specify this value is a long value

    //Primitives for number for decimal place
    //1. 10.2 -> double value
    //2. you cannot assign a double value to float variable, because float is with lower level of data type
    //3. In conclude, you cannot assign a higher level of data value to a lower level data type
    double d10 = 10.2;
    float f10 = 10.2f;//10.2f is a float value

    //float f11 = 10.5f + 10.5;// float + double -> double, cannot assign double to float as float is lower level data type

    double d11 = 99.99d;//same as double d12 = 99.99;

    //Local variable(within the main program(which is within the {}), you can only declare the same variable once)
    doube d12; //variable declaration, can not assign value first
    d12 = 10.9;//value assignment

    double d13 = 14.3;//declaration and assignment
    //double d13 = 19.0;//you cannot re-declare the same variable
    d13 = 19.0;//reassignment



  }
}