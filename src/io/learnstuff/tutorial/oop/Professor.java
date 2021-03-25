package io.learnstuff.tutorial.oop;

public class Professor extends Person {



    public Professor(String name){
        this.setName(name);
    }


    @Override
    public void doStuff() {
        System.out.println("I am a profesor. My name is: " + getName());
    }
}
