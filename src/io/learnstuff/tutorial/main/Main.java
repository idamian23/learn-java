package io.learnstuff.tutorial.main;

import java.util.Random;
import java.util.Scanner;


public class Main {
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
        String[] arrString = {"abc", "asfasd", null};
        System.out.println(counter.count(arrString, "abc"));

        // Assignment 1 - Exercise 2
        // Read an array and a matrix from the keyboard
        // (requires the use of scanner)

        int length;
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);

        // For Array
        System.out.println("Array length: ");
        length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Introduce your array elements here: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your array's elements are: ");
        System.out.print("[ ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print("]\n");

        // For Matrix
        Random random = new Random();
        System.out.println("Enter number of rows for the matrix: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns for the matrix: ");
        columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements for the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Generating elements for the matrix ...");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }
}

