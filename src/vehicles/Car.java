package vehicles;

import interfaces.Speed;
import interfaces.Refuelable;

public class Car extends Vehicle implements Speed, Refuelable{
    private int speed = 0;

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " car is stopping.");
    }

    @Override
    public void accelerate() {
        speed += 50;
        System.out.println("Car accelerates to " + speed + " km/h.");
    }

    @Override
    public void brake() {
        speed -= 25;
        System.out.println("Car slows down to " + speed + " km/h.");
    }

    @Override
    public void refuel(){
        System.out.println("Car is refueling.");
    }
}

