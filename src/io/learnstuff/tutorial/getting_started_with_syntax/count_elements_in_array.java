package io.learnstuff.tutorial.getting_started_with_syntax;


public class count_elements_in_array {
    public static void main(String[] args) {


        //  Assignment 1 - Exercise 1
        //For an array of elements count the number of occurrences of
        //a given element.
        //(experiment with arrays of numbers and strings)
        Counter counter = new Counter();

        //Array of Integers
        int[] arrInt = {1, 2, 3, 4, 2, 2, 2, 2};
        System.out.println(counter.count(arrInt, 2));

        //Array of Strings
        String[] arrString = {"caine", "pisica", null};
        System.out.println(counter.count(arrString, "caine"));





    }
}

