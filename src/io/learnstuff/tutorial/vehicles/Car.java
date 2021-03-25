package io.learnstuff.tutorial.vehicles;

public class Car extends Vehicle implements CarInterface{
    private double speedStatus = 0;
    private double maxSpeed;

    public Car(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double accelerate(double speedUp) {

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
        speedStatus -= speedStatus;
    }

    @Override
    public void showSpeed() {
        System.out.println(speedStatus);
        System.out.println("Your current speed is: " + speedStatus);
    }
}
