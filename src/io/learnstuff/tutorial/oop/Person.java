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
    public void doStuff(){
            System.out.println("A real person does things!");

    }
}

/*
Write classes that describe types of vehicles, starting from a base class and extending it

Write at least two interfaces that reinforce specific behavior for any vehicle and make sure the classes you describe
 implement the interfaces

Use the interfaces and the base class as types (polymorphism) and write  a program that executes various action on vehicle
instances.


Write a class that represents an abstract person. Extend that class for particular types of people: professor, student,
 janitor, security guard, each with job specific methods, and common methods that they override, in their specific way.

Considering that the basic database operation usually performed on a database are create, read, update, delete (CRUD):
Model an interface for database operations
Implement the interface in at least three different ways
By using a control structure and input provided by the console (using Scanner) use different implementations of the
interface to perform different operations

Given a large body of text, implement a class with at least three methods that process the text in order to replace
 a given word with their revers. The methods will demonstrate overloading. The three methods of text processing that
 should be implemented are:
Using split (using and array and the ‘for’ control structure)
Using indexOf and substr (using the ‘while’ control structure)
Using replace and indexOf (using the ‘do - while’ control structure)
Note that the methods need to have different but semantically meaningful signatures.
 */