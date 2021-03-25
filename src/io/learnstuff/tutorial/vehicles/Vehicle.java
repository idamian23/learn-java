package io.learnstuff.tutorial.vehicles;

public class Vehicle {


    private final static int wheels = 4;
    private int maxFuelCapacity; // litres





    // getters and setters


    public int getMaxFuelCapacity() {
        System.out.println("Your max fuel capacity is: " + maxFuelCapacity);
        return maxFuelCapacity;
    }

    public void setMaxFuelCapacity(int maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public static int getWheels() {
        return wheels;
    }


}
