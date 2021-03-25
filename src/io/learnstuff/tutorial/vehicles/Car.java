package io.learnstuff.tutorial.vehicles;

public class Car extends Vehicle implements CarInterface{
    private double currentSpeed = 0;
    private double maxSpeed;

    public Car(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double accelerate(double speedUp) {
        System.out.println("Car accelerated!");

        currentSpeed += speedUp;

        if (currentSpeed > maxSpeed) {
            throw new IllegalStateException("You are at the maximum speed. Slow down! Life has priority!");
        } else return currentSpeed;


    }

    @Override
    public void decelerate(double speedDown) {
        currentSpeed -= speedDown;

    }

    @Override
    public void brake() {
        System.out.println("Car has braked.");
        currentSpeed -= currentSpeed;
    }

    @Override
    public void showSpeed() {

        System.out.println("Your current speed is: " + currentSpeed);
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }


    public double getCurrentSpeed() {
        return currentSpeed;
    }
}
