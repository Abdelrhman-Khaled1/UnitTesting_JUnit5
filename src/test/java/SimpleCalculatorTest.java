import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator calculator;

    @BeforeEach
    void init() {
        calculator = new SimpleCalculator();
    }

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));
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

    @Test
    @DisplayName("multiply method")
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, calculator.multiply(2, 2)),
                () -> assertEquals(0, calculator.multiply(2, 0)),
                () -> assertEquals(-2, calculator.multiply(2, -1))
        );
    }

    @Test
    @DisplayName("When adding two negative numbers")
    void testAddNegative() {
        int expected = -2;
        int actual = calculator.add(-1, -1);
        //very expensive operation assertEquals take 3 parameters, and we compute the string even we don't need it
        //assertEquals(expected, actual, "Should return sum " + expected + " but returned " + actual);
        assertEquals(expected, actual, () -> "Should return sum " + expected + " but returned " + actual); // now it was a lambda and will be called only if the function fail! Wow
    }

}