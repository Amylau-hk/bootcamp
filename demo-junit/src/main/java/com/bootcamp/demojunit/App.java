package com.bootcamp.demojunit;


public class App {

    // Unit Test
    // !!! For testing, it doesnt care the result of subtract() and sum()
    // Requirement: x >= 10, return x - y, otherwise x + y
    public static int combine(int x, int y) {
        if(x >= 10 && y >= 3)
        //  return x - y;
        return subtract(x, y);
         // day 2 requirement
        //  if (y < 5)
        //  return x * y;
        return sum(x, y);
    }

    // Unit Test
     public static int subtract(int x, int y) {
         return x - y;
        }

    // Unit Test
    public static int sum(int x, int y){
        return x + y;
    }

    public static int divide(int x, int y){
        return x / y;
    }
    }

