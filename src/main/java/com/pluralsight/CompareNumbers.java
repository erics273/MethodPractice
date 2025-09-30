package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        //one liners
        System.out.println( isEven(5) );
        System.out.println( isEven(4) );

        //more verbose with variables and storing output from the function
//        int number = 6;
//        boolean result = isEven(number);
//
//        System.out.println(result);

        System.out.println( isPositive(-6) );

    }

    public static boolean isEven(int number){

        //if the number is even, return true
        //using the modulus operator we can determine the remainder after
        //divinging by 2. if there is a remainder it's odd
        //if there is no remainder it's even
        if( number % 2 == 0 ){
            return true;
        }

        //return false if it was not even
        return false;

        //slick one line return to determine true false
       // return number % 2 == 0;

    }

    public static boolean isPositive(double number){

        //if the number is > 0 its positive
        //if the number is < than 0 its negative
        //we are calling 0 not positive
        if( number > 0 ){
            return true;
        }else{
            return false;
        }

        //one liner
        //return number > 0;

    }

}
