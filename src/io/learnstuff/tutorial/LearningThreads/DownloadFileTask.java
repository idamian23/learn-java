package io.learnstuff.tutorial.LearningThreads;

public class DownloadFileTask implements Runnable {


    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file - " + Thread.currentThread().getName());

        // Pausing a thread
        /*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
            System.out.println("Download complete." + Thread.currentThread().getName());
        }
    }
}
