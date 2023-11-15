import org.example.Vehicles.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTests {
    @Test
    public void testDisplayFeatures(){
        var brand = "Lamborghini";
        var speed = 300;
        var vehicle = new Vehicle(brand, speed);
        var output = vehicle.getFeatures();
        var expected = " My " + brand + "is traveling at " + speed + "km/h";

        assertEquals(expected,output);

    }

}
