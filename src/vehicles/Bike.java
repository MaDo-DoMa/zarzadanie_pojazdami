package vehicles;

import interfaces.Speed;


public class Bike extends Vehicle implements Speed{
    private int speed = 0;
    private int count_of_wheels = 2;

    public Bike(String brand, int year){
         super(brand, year);
    }

    @Override
    public void start() {

    }

    @Override
    public void accelerate(){
        speed += 5;
        System.out.printf("Bike "+ brand + " accelerate to: " + speed);
    }

    @Override
    public void stop(){
        System.out.println(brand + " bike stopped, not so funny");
    }

    @Override
    public void brake(){
        speed -= 2;
        System.out.println("Bike slows down to "+ speed);
    }

}
