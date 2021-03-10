package io.learnstuff.tutorial.main;

public class Main {
    public static void main(String[] args) {


        //  Assignment 1 - Exercise 1
        Counter counter = new Counter();

        //Array of Integers
        int[] arr = {1, 2, 3, 4, 2, 2, 2, 2};
        System.out.println(counter.count(arr, 2));

        //Array of Strings
        String[] arrString = {"abc", "asfasd", null};
        System.out.println(counter.count(arrString, "abc"));
    }

}

