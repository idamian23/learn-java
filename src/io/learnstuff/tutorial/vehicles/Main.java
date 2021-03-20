package io.learnstuff.tutorial.vehicles;

public class Main {
    private static Car car;
    private static Plane plane;

    public static void main(String[] args){

        car = new Car(2000, 60, 2021, "BMW");
        plane = new Plane(15000, 100, 2009, "Boeing", 101);

        car.start();
        plane.start();

        System.out.println("----------------------------------");
        System.out.println(car.toString());
        System.out.println("---------------------------------------");
        System.out.println(plane.toString());


    }
}
