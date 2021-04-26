package io.learnstuff.tutorial.LearningThreads;

public class Main {
    public static void main(String[] arg){
        System.out.println(Thread.activeCount() );
        System.out.println(Runtime.getRuntime().availableProcessors());
        ThreadDemo.show();
        ExecutorsDemo.show();

    }
}
