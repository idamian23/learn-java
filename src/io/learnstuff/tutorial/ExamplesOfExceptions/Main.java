package io.learnstuff.tutorial.ExamplesOfExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        //NullPointerException
        String string = null;
        try{
            if(string.equals("test"))
                System.out.println("Equals");
            else
                System.out.println("Different");
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptio : String is null!");
        }
        //Arithmetic Exception
        try{
            int i = 0 / 0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        // Number Format Exception
        int number;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter valid Integer: ");
            try {
                number = Integer.parseInt(scanner.next());
                System.out.println("You entered: " + number);
                break;
            }catch (NumberFormatException e) {
                System.out.println("Number Format Exception occured!");
            }
        }


    }
}
