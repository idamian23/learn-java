package io.learnstuff.tutorial.vehicles;

public class Plane extends Vehicle{



    private double wingSpan;

    public Plane(){ //Constructor
        System.out.println("A new plane has been created.");
    }
    public Plane(double weight, double fuel, int year, String brand, double wingSpan) {
        super(weight,fuel,year,brand);
        setWingSpan(wingSpan);
    }

    public String toString(){
        String str = "Brand: " + super.getBrand();
        str += "\nYear: " + super.getYear();
        str += "\nWeight: " + super.getWeight();
        str += "\nFuel: " + super.getFuel();
        str += "\nEngine state: " + super.getEngineState() ;
        str += "\nWingspan: " + this.getWingSpan();

        return str;
    }

    //Getters and Setters
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

}
