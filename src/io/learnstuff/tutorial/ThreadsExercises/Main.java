package io.learnstuff.tutorial.ThreadsExercises;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Exercitiul 1
        /*Using Threads write an application that sorts an array of random generated numbers using
        three different sort methods.  Display the execution time of each thread.*/
        int capacity = 10;
        Random random = new Random();

        int[] myRandomArray = new int[capacity];
        int[] myRandomArray2 = new int[capacity];
        int[] myRandomArray3 = new int[capacity];

        for (int i = 0; i < myRandomArray.length; i++) {
            myRandomArray[i] = random.nextInt(3);
            myRandomArray2[i] = myRandomArray[i];
            myRandomArray3[i] = myRandomArray[i];
        }

        System.out.print("My random array : ");
        BubbleSortThread.printArray(myRandomArray);


        Thread thread1 = new Thread(new BubbleSortThread(myRandomArray));
        Thread thread2 = new Thread(new SelectionSortThread(myRandomArray2));
        Thread thread3 = new Thread(new QuickSortThread((myRandomArray3)));

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exercitiul 2
        /*Use Threads to search for a number in a very long randomly generated array of integers.
        Create at least four threads and run them in parallel. You will have to specify for each
        thread the start and end index/position in the array.*/



        Thread thread4 = new Thread(new SearchingThread(myRandomArray, 1 , 0 , 3));
        Thread thread5 = new Thread(new SearchingThread(myRandomArray,1,4,6));
        Thread thread6 = new Thread(new SearchingThread(myRandomArray,1,7,8));
        Thread thread7 = new Thread(new SearchingThread(myRandomArray,1,9,10));

        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();

        //Exercitiul 3
        /*Using Threads, count the occurrence of a specific word in a body of text.
         Create at least four threads and run them in parallel.*/
        Thread thread8 = new Thread(new TextReadingThread("D:\\TextFile\\text.txt","java"));
        thread8.start();
        Thread thread9 = new Thread(new TextReadingThread("D:\\TextFile\\text.txt","Gobert"));
        thread9.start();
        Thread thread10 = new Thread(new TextReadingThread("D:\\TextFile\\text.txt","of"));
        thread10.start();
        Thread thread11 = new Thread(new TextReadingThread("D:\\TextFile\\text.txt","if"));
        thread11.start();
        

    }

}
