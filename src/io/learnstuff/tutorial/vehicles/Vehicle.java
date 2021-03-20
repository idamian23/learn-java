package io.learnstuff.tutorial.vehicles;


// Parent Class

public class Vehicle {

    private double weight;
    private double fuel;
    private int year;
    private String brand;
    private String engineState; // OFF or ON

    public Vehicle(){};
    public Vehicle(double weight, double fuel, int year, String brand) {
        setWeight(weight);
        setFuel(fuel);
        setYear(year);
        setBrand(brand);
        setEngineState("OFF");
    }


    //functions
    public void start(){
    if(this.engineState == "ON"){
        System.out.println("System already on.");
    }else {
        this.setEngineState("ON");
        System.out.println("Engine is ON.");
    }
    }

    public void stop(){
        if (this.engineState == "OFF"){
            System.out.println("Engine is already OFF");
        }else{this.setEngineState("OFF");
            System.out.println("Engine is turned OFF.");
        }

    }



    //getters and setter


    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
