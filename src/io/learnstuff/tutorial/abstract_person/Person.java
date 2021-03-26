package io.learnstuff.tutorial.abstract_person;

public abstract class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public abstract void introduceYourself();

    public abstract void nameYourJob();

    //getter
    public String getName() {
        return name;
    }
}
