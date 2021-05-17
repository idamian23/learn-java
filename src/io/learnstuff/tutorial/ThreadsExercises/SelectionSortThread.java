package io.learnstuff.tutorial.ThreadsExercises;

public class SelectionSortThread implements Runnable {
    int[] array;

    public SelectionSortThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long runtime;

       /* try {
            Thread.sleep(502);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.print("Selection Sorted array : ");
        selectionSort(array);
        BubbleSortThread.printArray(array);

        runtime = System.currentTimeMillis() - start;
        System.out.println("Time for execution : " + runtime + " miliseconds" + " on " + Thread.currentThread().getName());

    }

    void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}


