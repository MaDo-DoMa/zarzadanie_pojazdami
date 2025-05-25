package Vehicles;

public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected int count_of_wheels;

    Vehicle(String brand, int year, int count_of_wheels) {
        this.brand = brand;
        this.year = year;
        this.count_of_wheels = count_of_wheels;
    }

    public abstract void start();

    public abstract void stop();

    public void display_info{
        System.out.println("Vehicle: " + brand + ", made in: " + year + ", count_of wheels: " + count_of_wheels);
    }
}