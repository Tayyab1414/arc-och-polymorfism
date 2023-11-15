import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTests {
@Test
    public void testAddTwoInts(){
    var calc = new Calculator();
    var expected = 5;
    var actual = calc.add(2,3);

    assertEquals(expected, actual);

    }

    public void testAddThreeInts(){
    var calc = new Calculator();
    var expected = 10;
    var actuals = calc.add(5,2,3);

    assertEquals(expected, actuals);

    }
    public void testAddTwoDoubles(){
    var calc = new Calculator();
    var expected = 10;
    var actulal = calc.add(5.5,4.5);

    assertEquals(actulal, expected);

    }
}
