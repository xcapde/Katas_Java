package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void calculatorStartsZero() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(0.0, result);
    }

    @Test
    public void sumNumber() {
        //GIVEN
        Calculator calculator = new Calculator();
        calculator.sum(8);
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(8, result);
    }

    @Test
    public void restNumber() {
        //GIVEN
        Calculator calculator = new Calculator();
        calculator.rest(2);
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(-2, result);
    }

    @Test
    public void multiplyNumber() {
        //GIVEN
        Calculator calculator = new Calculator();
        calculator.multi(2);
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(0, result);
    }

    @Test
    public void divNumber() {
        //GIVEN
        Calculator calculator = new Calculator();
        calculator.div(10.00);
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(0, result);
    }

    // NO ESTÀ BÉ, HAURIA DE SER PERCENTATGES....
    @Test
    public void modNumber() {
        //GIVEN
        Calculator calculator = new Calculator();
        calculator.mod(12);
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(0, result);
    }

    @Test
    public void checkEven() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        boolean result = calculator.isEven(12);
        //THEN
        assertTrue(result);
    }

    @Test
    public void biggerNum() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        double result = calculator.isBigger(5, 7);
        //THEN
        assertEquals(7, result);
    }

    /*@Test
    public void sumArray() {
        //GIVEN
        Calculator calculator = new Calculator();
        double [] doubleArry = new double[](1, 1, 3, 5, 40);
        //WHEN
        calculator.sumArry(doubleArry)
        //THEN
        assertEquals(50, result);
    }*/

}