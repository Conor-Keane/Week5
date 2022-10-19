package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testAdd() {
        assertEquals(6, myCalc.add());
    }

    @AfterEach
    void tearDown() {

    }
}