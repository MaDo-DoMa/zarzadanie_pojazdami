package vehicles;

import interfaces.Speed;
import interfaces.EcoFriendly;

public class ElectricCar extends Vehicle implements Speed, EcoFriendly {
    private int speed = 0;

    public ElectricCar(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println(brand + " electric car powers up silently.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " electric car powers down.");
    }

    @Override
    public void accelerate() {
        speed += 100;
        System.out.println("Electric car zooms to " + speed + " km/h.");
    }

    @Override
    public void brake() {
        speed -= 50;
        System.out.println("Electric car slows down to " + speed + " km/h.");
    }

    @Override
    public void reduceEmissions() {
        System.out.println("Electric car is reducing emissions by using clean energy.");
    }

    public void recharge(){
        System.out.println("Electric car is recharging.");
    }
}
