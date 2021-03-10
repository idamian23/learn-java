package io.learnstuff.tutorial.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

    //Assignment 1 - Exercise 3
    // Use the Random class to generate elements for a matrix for which you read
    //length and height from the keyboard.

    public static void main(String[] args){
        Random random = new Random();
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for the matrix: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns for the matrix: ");
        columns = scanner.nextInt();
        System.out.println("Enter the bounderies of the matrix: ");
        int bound = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(bound);
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
