package io.learnstuff.tutorial.oop;

public class Janitor extends Person{

    @Override
    public void doStuff() {
        super.doStuff();
        System.out.println("I clean up.");
    }
}
