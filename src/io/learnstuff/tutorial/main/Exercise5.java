package io.learnstuff.tutorial.main;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    //Generate a random array of numbers and searvh for a specific one.
    //If you find it then use a named break to exit the loop.

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int length = random.nextInt(100);
        int toFind;


        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("The automated generated array is :");
        System.out.print("[ ");
        for(int i = 0; i < length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.print(" ]");

        System.out.println("\nChoose you number to find: ");
        toFind = scanner.nextInt();

        int count = 0;
        for(int i = 0; i < length; i++){
            if(arr[i] == toFind){
               count++;
            }
        }
        if(count > 0){
              System.out.println("Your number is in the array!");

        }else{
            System.out.println("Sorry, it is not in the array!");
        }
        }
    }

