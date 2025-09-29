package com.pluralsight;

public class Hello {

    public static void main(String[] args) {

        //call the method sayHello
        sayHello();
        sayGoodbye();
        sayGoodMorning();

    }

    //create the method
    public static void sayHello(){
        System.out.println("Hello World!");
    }

    public static void sayGoodbye(){
        System.out.println("Goodbye");
    }

    public static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }

}
