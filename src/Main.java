import vehicles.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota", 2020),
                new Bike("Yamaha", 2018),
                new ElectricCar("Tesla", 2023)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.start();

            if (v instanceof Speed) {
                Speed s = (Speed) v;
                s.accelerate();
                s.brake();
            }

            if (v instanceof EcoFriendly) {
                ((EcoFriendly) v).reduceEmissions();
            }

            v.stop();
            System.out.println("---------------");
        }
    }
}
