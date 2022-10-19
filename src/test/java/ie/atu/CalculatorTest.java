package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(6, myCalc.add());
    }

    @Test
    void testSubtract()
    {
        assertEquals(2, myCalc.subtract());
    }

    @Test
    void testMultiply()
    {
        assertEquals(2, myCalc.multiply());
    }

    @Test
    void testCalculator()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Calculator(4);});
        assertEquals("This is not a valid number", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {

    }


}