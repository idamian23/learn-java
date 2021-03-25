package io.learnstuff.tutorial.oop;

public class Janitor extends Person{

    public Janitor(String name){
        setName(name);
    }

    @Override
    public void doStuff() {
        System.out.println("I clean up.");
    }
}
