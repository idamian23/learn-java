package io.learnstuff.tutorial.abstract_person;

public class Professor extends Person {

    public Professor(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("My name is " + name + ".");
    }

    @Override
    public void nameYourJob() {
        System.out.println("My job is to teach people.");
    }

    public void professorMethod(int numberForGaussCalculator){
        int sum = numberForGaussCalculator * (numberForGaussCalculator + 1)/2;
        System.out.println("Sum of Gauss for " + numberForGaussCalculator + " is equal to " + sum );
    }

}
