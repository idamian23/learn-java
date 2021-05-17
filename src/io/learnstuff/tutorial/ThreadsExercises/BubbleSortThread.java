package io.learnstuff.tutorial.ThreadsExercises;

public class BubbleSortThread implements Runnable {
    int[] array;

    public BubbleSortThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        long start =  System.currentTimeMillis();
        long runtime;

       /* try {
            Thread.sleep(201);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.print("Buble Sorted array : ");
        bubbleSort(array);
        printArray(array);
        runtime = System.currentTimeMillis() - start;
        System.out.println("Time for execution : " + runtime + " miliseconds" + " on " + Thread.currentThread().getName());

    }

    public static void printArray(int[] myRandomArray) {
        int n = myRandomArray.length;
        for (int i = 0; i < n; ++i)
            System.out.print(myRandomArray[i] + " ");
        System.out.println();
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


    }


}
