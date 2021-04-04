package io.learnstuff.tutorial.queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item) throws QueueFullException {
        if(count == items.length)
            throw new QueueFullException("The queue is full.");
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;

    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
