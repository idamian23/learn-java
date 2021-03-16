package io.learnstuff.tutorial.getting_started_with_syntax;

import java.util.Random;
import java.util.Scanner;

public class create_array_and_matrix {
    public static void main(String[] args){

        // Assignment 1 - Exercise 2
        // Read an array and a matrix from the keyboard
        // (requires the use of scanner).

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
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the elements for the matrix: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements for the matrix ...");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
    }
}
