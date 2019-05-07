import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumber(){
        assertEquals(6, calculator.add(3, 3));
    }

    @Test
    public void subtractNumber(){
        assertEquals(5, calculator.subtract(8, 3));
    }

    @Test
    public void multiplyNumber(){
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    public void divideNumber(){
        assertEquals(5, calculator.divide(10, 2));
    }

}
