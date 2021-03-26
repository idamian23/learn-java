package io.learnstuff.tutorial.abstract_person;

public class Student extends Person{


    private  String name;

    public Student(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("My name is " + name + ".");
    }

    @Override
    public void nameYourJob() {
        System.out.println("My duty is to calculate the Fibonacci series.");
    }

    public void studentMethod(int upToNumber){   //calculate Fibonacci series
        int constant1 = 0 , constant2 = 1;
        System.out.print("Up to " + upToNumber + ": ");
        while(constant1 <= upToNumber){
            System.out.print(constant1 + " ");
            int sum = constant1 + constant2;
            constant1 = constant2;
            constant2 = sum;

        }

    }
}
