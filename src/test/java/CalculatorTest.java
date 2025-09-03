import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    private final Calculator calculator = new Calculator();
    @Test
    void testAdd() {
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(1,1));
    }

    @Test
    void testMultiply() {
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    void testDivide() {
        assertEquals(1, calculator.divide(2,2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5,0));
    }

}
