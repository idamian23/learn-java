package io.learnstuff.tutorial.vehicles;

public class Car extends  Vehicle{


    public Car(){  //Constructor
        System.out.println("A new car has been created.");
    }
    public Car(double weight, double fuel, int year, String brand) {
       super(weight,fuel,year,brand);
    }


    public String toString(){
        String str = "Brand: " + super.getBrand();
        str += "\nYear: " + super.getYear();
        str += "\nWeight: " + super.getWeight();
        str += "\nFuel: " + super.getFuel();
        str += "\nEngine state: " + super.getEngineState() ;

        return str;
    }

}
