package io.learnstuff.tutorial.oop;

public abstract class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // code to execute
    public abstract void doStuff() ;
}

