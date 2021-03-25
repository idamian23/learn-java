package io.learnstuff.tutorial.vehicles;

public class Main {
    public static void main(String[] arg){
        var car = new Car(120);
        var truck = new Truck(40);

        truck.setMaxTransportCapacity(40);
        truck.load(40);
        truck.unload(10);
        truck.showTrailStatus();
        System.out.println("Your truck max capacity is: " + truck.getMaxTransportCapacity());

        car.setMaxSpeed(120);
        car.accelerate(120);
        car.decelerate(5);
        car.showSpeed();
        car.brake();
        car.showSpeed();

        System.out.println();
    }
}
