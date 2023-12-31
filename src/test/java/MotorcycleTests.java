import org.example.Vehicles.Motorcycle;
import org.junit.jupiter.api.Test;
import org.example.Vehicles.Vehicle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTests {
@Test
   public void testGetMotorcycleInfoHasSidecar(){
    var brand = "Honda ";
    var speed = 20;
    var hasSidecar = true;
    var motorcycle = new Motorcycle(brand, speed, hasSidecar );

    var expected = "My " + brand + " is traveling at " + speed + " km/h "
            + " and has sidecar";
    var actual = motorcycle.getFeatures();

    assertEquals(expected,actual);
    }


    @Test
    public void testGetMotorcycleInfoHasNoSidecar(){
        var brand = "Honda";
        var speed = 20;
        var hasSidecar = false;
        var motorcycle = new Motorcycle(brand, speed, hasSidecar );

        var expected = "My " + brand + " is traveling at " + speed + " km/h "
                + " and has no sidecar";
        var actual = motorcycle.getMotorcycleInfo();

        assertEquals(expected,actual);
    }
@Test
    public void testAccelarateMototcycle(){
    var mc = new Motorcycle("Bose", 0, true);
    mc.accelerate();
    var expected = 15;
    var actual = mc.getSpeed();
    assertEquals(expected, actual);

    }

}
