package io.learnstuff.tutorial.getting_started_with_syntax;

import java.util.Random;
import java.util.Scanner;

public class matrix_operations {
    public static void main(String[] arg) {
        //For two given matrices implement:
        //matrix addition , matrix scalar multiplication
        //and matrix multiplication
        Random random = new Random();
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for the matrices: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns for the matrices: ");
        columns = scanner.nextInt();
        System.out.println("Enter bounderies for the matrices: ");
        int bound = scanner.nextInt();

        int[][] firstMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = random.nextInt(bound);
            }
        }

        System.out.println("Generating elements for the  first matrix ...");
        printMatrix(firstMatrix);


        int[][] secondMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                secondMatrix[i][j] = random.nextInt(bound);
            }
        }

        System.out.println("Generating elements for the second matrix ...");
        printMatrix(secondMatrix);

    addMatrices(firstMatrix, secondMatrix);
    multipleMatrices(firstMatrix, secondMatrix);
    scalarMatrices(2,firstMatrix);
    }

    public static void printMatrix( int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void addMatrices(int[][]first, int[][] second){
        int row = first.length;
        int column = first[0].length;
        int[][] sum = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of Matrices: ");
        printMatrix(sum);
    }
    public static void multipleMatrices(int[][]first, int[][] second){
        int row = first.length;
        int column = first[0].length;
        int[][] product = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                product[i][j] = first[i][j] * second[i][j];
            }
        }

        System.out.println("Product of Matrices: ");
        printMatrix(product);
    }
    public static void scalarMatrices(int scalar, int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] scalarResult = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                scalarResult[i][j] = scalar + matrix[i][j];
            }
        }

        System.out.println("Scalar  of the matrix: ");
        printMatrix(scalarResult);
    }

}