import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals (4,calculator.add(2,2));
    }
    @Test
    void threePlusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals (10,calculator.add(3,7));
    }

    @Test
    public void testAddition() {
        var calculator = new SimpleCalculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result); // Verifying that 2 + 3 equals 5
    }

    @Test
    public void testDivisionByZero() {
        var calculator = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }); // Verifying that dividing by zero throws an exception
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    public void testEvenNumbers(int number) {
        assertTrue(number % 2 == 0); // Verifying that all numbers in the list are even
    }

}