package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd01() {
        double result = calculator.add(3, 9);
        assertEquals(12, result, 0.001);
    }

    @Test
    public void testAdd02() {
        double result = calculator.add(5.7, 85.23);
        assertEquals(90.93, result, 0.001);
    }

    @Test
    public void testAdd03() {
        double result = calculator.add(-200, -5);
        assertEquals(-205, result, 0.001);
    }

    @Test
    public void testMinus01() {
        double result = calculator.minus(3, 9);
        assertEquals(-6, result, 0.001);
    }

    @Test
    public void testMinus02() {
        double result = calculator.minus(5.7, 85.23);
        assertEquals(-79.53, result, 0.001);
    }

    @Test
    public void testMinus03() {
        double result = calculator.minus(-200, -5);
        assertEquals(-195, result, 0.001);
    }

    @Test
    public void testDivision01() {
        double result = calculator.divide(3, 9);
        assertEquals(0.333, result, 0.001);
    }
    @Test
    public void testDivision04() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });

    }

    @Test
    public void testDivision02() {
        double result = calculator.divide(5.7, 85.23);
        assertEquals(0.067, result, 0.001);
    }

    @Test
    public void testDivision03() {
        double result = calculator.divide(-200, -5);
        assertEquals(40, result, 0.001);
    }

    @Test
    public void testMultiplication01() {
        double result = calculator.multiply(3, 9);
        assertEquals(27, result, 0.001);
    }

    @Test
    public void testMultiplication02() {
        double result = calculator.multiply(5.7, 85.23);
        assertEquals(485.811, result, 0.001);
    }

    @Test
    public void testMultiplication03() {
        double result = calculator.multiply(-200, -5);
        assertEquals(1000, result, 0.001);
    }


    @Test
    public void testFacultyMethod01() {
        double result = calculator.calcFaculty(5);
        assertEquals(120, result);
    }

    @Test
    public void testFacultyMethod02() {
        double result = calculator.calcFaculty(6);
        assertEquals(720, result);
    }
    @Test
    public void testFacultyMethod03() {
        double result = calculator.calcFaculty(3);
        assertEquals(6, result);
    }

}
