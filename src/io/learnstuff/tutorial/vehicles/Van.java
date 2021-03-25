package io.learnstuff.tutorial.vehicles;

public class Van extends Vehicle implements CarriageInterface, CarInterface{

    private double maxTransportCapacity;  // tons
    private double maxSpeed;
    private double trailStatus = 0;
    private double currentSpeed = 0;

    public Van(double maxTransportCapacity, double maxSpeed){
        this.maxTransportCapacity = maxTransportCapacity;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double load(double amount) {
        trailStatus += amount;
        if (trailStatus > maxTransportCapacity){
            throw new IllegalStateException("You overloaded. PLEASE unload!");
        }else return trailStatus;
    }

    @Override
    public void unload(double amount) {
        trailStatus -= amount;

    }

    @Override
    public void showTrailStatus() {
        System.out.println("Your trail status is: " + trailStatus);

    }

    @Override
    public void emptyTruck() {
        trailStatus = 0;
    }

    @Override
    public double accelerate(double speedUp) {
        System.out.println("Van accelerated!");

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
        currentSpeed -= currentSpeed;
    }

    @Override
    public void showSpeed() {
        System.out.println("Your current speed is: " + currentSpeed);
    }

    public double getMaxTransportCapacity() {
        return maxTransportCapacity;
    }

    public void setMaxTransportCapacity(double maxTransportCapacity) {

        this.maxTransportCapacity = maxTransportCapacity;
        System.out.println("Your max transport capacity is: " + maxTransportCapacity);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTrailStatus() {
        return trailStatus;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
}
