package io.learnstuff.tutorial.vehicles;

public class Car extends Vehicle implements CarInterface{
    private double speedStatus = 0;
    private double maxSpeed;

    public Car(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double accelerate(double speedUp) {
        System.out.println("Car accelerated!");

        speedStatus += speedUp;

        if (speedStatus > maxSpeed) {
            throw new IllegalStateException("You are at the maximum speed. Slow down! Life has priority!");
        } else return speedStatus;


    }

    @Override
    public void decelerate(double speedDown) {
        speedStatus -= speedDown;

    }

    @Override
    public void brake() {
        System.out.println("Car has braked.");
        speedStatus -= speedStatus;
    }

    @Override
    public void showSpeed() {

        System.out.println("Your current speed is: " + speedStatus);
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getSpeedStatus() {
        return speedStatus;
    }
}
