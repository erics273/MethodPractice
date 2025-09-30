package com.pluralsight;

public class Format {

    //this is the method we will call our other methods from
    public static void main(String[] args) {

        //crete variables for a first and last name
        String firstPotato = "Alex";
        String lastPotato = "Johnson";

        //run formatName and store the result in fullName
        String fullName = formatName(firstPotato, lastPotato);

        //print out fullName
        System.out.println(fullName);

        //one liners if we dont care about storing indvidual pieces in variables
//        System.out.println( formatName("eric", "schwartz") );
//        System.out.println( formatName("Paul", "Kimball") );


    }

    //this function takes a first name and a last name
    //and stores them in a specific order and hands that value back
    public static String formatName(String first, String last){
        //take the last name and put it first, then add a , and then add the first name
        return last + ", " + first;
    }

}
