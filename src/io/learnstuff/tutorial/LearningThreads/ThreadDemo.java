package io.learnstuff.tutorial.LearningThreads;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        //System.out.println(Thread.currentThread().getName());


        /*
        for(var i = 0; i < 3; i++){
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();}
        */

        //Thread thread = new Thread(new DownloadFileTask());
        //thread.start();

        //  Joining a thread
        /*try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File is ready to be scanned. ");
        */

        // Pausing a thread
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
         */

        //Race Conditions
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (var i = 0; i < 10; i++){
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(status.getTotalBytes());
    }
}
