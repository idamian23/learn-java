package io.learnstuff.tutorial.vehicles;

public class Main {
    public static void main(String[] arg){
        var car = new Car(120);
        var truck = new Truck(40);
        var van = new Van(20,100);

        System.out.println("--------------TRUCK---------------");
        truck.showTrailStatus();
        truck.load(40);
        truck.unload(10);
        truck.showTrailStatus();
        System.out.println("Your truck max capacity of trail is: " + truck.getMaxTransportCapacity());
        truck.emptyTruck();
        truck.showTrailStatus();
        truck.setMaxFuelCapacity(130);
        truck.getMaxFuelCapacity();

        System.out.println("---------------CAR----------------");
        car.accelerate(120);
        car.decelerate(5);
        car.showSpeed();
        car.brake();
        car.showSpeed();
        car.getMaxSpeed();

        System.out.println("---------------VAN----------------");
        van.setMaxSpeed(100);
        van.setMaxTransportCapacity(10);
        van.showSpeed();
        van.accelerate(50);
        van.showSpeed();
        van.load(5);
        van.showTrailStatus();

        System.out.println("-------Static final variable-----------");
        System.out.println("Number of wheels for your car : "+ car.getWheels());
        System.out.println("Number of wheels for your truck: "+ truck.getWheels());
    }
}
