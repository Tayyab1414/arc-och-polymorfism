import org.example.Vehicles.Car;
import org.example.Vehicles.Motorcycle;
import org.example.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    var myCar = new Car("Volvo", 240, 4 );
    var carInfo = myCar.getCarInfo();
        System.out.println(carInfo);
        polymorphismDemo();
        overriDemo();
        overloadDemo();

    }

    private static void overloadDemo(){

        System.out.println("\n---- Overload----");

        Calculator calc = new Calculator();

        System.out.println("Add two ints: " + calc.add(1,2 ));

        System.out.println("Add two ints: " + calc.add(1,2, 3 ));

        System.out.println("Add two doubles: " + calc.add(15.5,4.5 ));

    }
    private static void overriDemo(){

        System.out.println("\n----Override----");

        Vehicle vehicle = new Vehicle("Bus", 25 );
        Car car = new Car("Car", 25, 5);
        Motorcycle mc = new Motorcycle("Motocycle", 25, false);

        vehicle.accelerate();
        car.accelerate();
        mc.accelerate();

        System.out.println(vehicle.getFeatures());
        System.out.println(car.getFeatures());
        System.out.println(mc.getFeatures());

    }
    private static void polymorphismDemo(){

        System.out.println("\n----PolymorphismDemo----");

        // Creates empty list of vehicles.
        List<Vehicle> vehicleList = new ArrayList<>();

        Random random = new Random();

        //Loops 10x:
        for (int i = 0; i<10; i++);

        //Generates random number between 1-100
        int randomNumber = random.nextInt(1,100);

        //If random number is < 50: create Mc
        if (randomNumber < 50){
            Motorcycle mc = new Motorcycle("BMW", 350, true);
            vehicleList.add(mc); // Saves mc in list of vehicles.
        }
        // Otherwise create car
        else {
            Car car = new Car("Honda", 80, 5);
            vehicleList.add(car); // Saves car in list vehicles.
        }

        //In another (foreach-loop):
        for (Vehicle vehicle : vehicleList ){
            System.out.println(vehicle.getFeatures()); // Get and print vehicles feature
        }
    }

}