package io.learnstuff.tutorial.vehicles;

public class Truck extends Vehicle implements TruckInterface {
    private double maxTransportCapacity;  // tons
    private double trailStatus = 0;


    public Truck(double maxTransportCapacity){
        this.maxTransportCapacity = maxTransportCapacity;
    }

    @Override
    public double load(double amount) {
        System.out.println("Truck has loaded.");
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


    public double getMaxTransportCapacity() {
        return maxTransportCapacity;
    }


    public void setMaxTransportCapacity(double maxTransportCapacity) {
        this.maxTransportCapacity = maxTransportCapacity;
    }


}
