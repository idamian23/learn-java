package io.learnstuff.tutorial.stack;

public class Main {
    public static void main(String[] arg){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
