package io.learnstuff.tutorial.ThreadsExercises;

public class QuickSortThread implements Runnable{
    int[] array;

    public QuickSortThread(int[] array){
        this.array = array;
    }
    
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long runtime;

        System.out.print("Quick Sorted array : ");
        sort(array);
        BubbleSortThread.printArray(array);

        runtime = System.currentTimeMillis() - start;
        System.out.println("Time for execution : " + runtime + " miliseconds" + " on " + Thread.currentThread().getName());

    }
    public void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end){
        if(start >= end)
            return;

        var boundary = partition(array, start, end);

        sort(array, start,boundary - 1);
        sort(array,boundary + 1, end);
    }

    private int partition(int[] array, int start, int end){
        var pivot = array[end];
        var boundary = start - 1;
        for(int i = start ; i <= end; i++)
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        return boundary;
    }
    private void swap(int[] array, int index1, int index2){
        var temp =array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
