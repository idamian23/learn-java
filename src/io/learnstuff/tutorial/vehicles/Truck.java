package io.learnstuff.tutorial.vehicles;

public class Truck extends Vehicle implements TruckInterface {
    private final double maxSpeed = 90; // km/h
    private double maxTransportCapacity;  // tons
    private double trailStatus = 0;


    public Truck(double maxTransportCapacity){
        this.maxTransportCapacity = maxTransportCapacity;
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


}
