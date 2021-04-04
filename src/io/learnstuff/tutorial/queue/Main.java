package io.learnstuff.tutorial.queue;

public class Main {
    public static void main(String[] arg) throws QueueFullException {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        //queue.enqueue(60);
        System.out.println(queue);
        System.out.println( queue.dequeue());
        queue.enqueue(60);
        System.out.println(queue);
        System.out.println( queue.dequeue());
        queue.enqueue(70);
        System.out.println(queue);
        System.out.println(queue.isEmpty());

    }
}
