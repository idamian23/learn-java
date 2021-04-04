package io.learnstuff.tutorial.stack;

import java.util.Arrays;

public class Stack {

    private int count;
    private int capacity;
    private int[] items = new int[capacity];

    public Stack(int numerOfElements){
        this.capacity  = capacity;
    }

    public void push(int item){ //add
        if(count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop(){ //remove
        if (count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public int peek(){
        if (count == 0)
                throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(items, 0,count);
        return Arrays.toString(content);
    }
}
