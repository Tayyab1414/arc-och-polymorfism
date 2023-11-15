import org.junit.jupiter.api.Test;
import org.example.Vehicles.Car;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTests {
 @Test
    public void testGetcarInfo(){
    var brand = "Lamborghini";
    var speed = 300;
    var numberOfDoors = 3;

    var car = new Car(brand, speed, numberOfDoors );
    var expected = "My " + brand + " is traveling at " + speed + " km/h "
            + " and has " + numberOfDoors + " doors ";
    var actual = car.getCarInfo();

    }
    public void testAccelerateCar(){
     var car = new Car("Bose", 0, 4 );
     car.accelerate();
     var expected = 10;
     var actual = car.getSpeed();

     assertEquals(expected,actual);
    }

}


