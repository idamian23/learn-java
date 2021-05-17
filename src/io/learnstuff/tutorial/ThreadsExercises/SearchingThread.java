package io.learnstuff.tutorial.ThreadsExercises;

public class SearchingThread implements Runnable{
    int start;
    int end;
    int[] array;
    int numberToFind;
    boolean found;


    public SearchingThread(int[] array, int numberToFind, int start , int end){
        this.array = array;
        this.numberToFind = numberToFind;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        if (end > array.length)
            throw new IllegalArgumentException("The end argument is bigger than the length of the array!");
        for (int i = start; i <= end; i++) {
            if (array[i] == numberToFind)
                found = true;
                break;
        }
        if(found)
            System.out.println("Your number has been found in : " + Thread.currentThread().getName() );
        else
            System.out.println("Your number has not been found in : " + Thread.currentThread().getName());
    }
}