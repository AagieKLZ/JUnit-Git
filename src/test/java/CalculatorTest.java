/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.junitgitm5.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumne
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testSquareRoot() {
        System.out.println("squareRoot");
        double number = 4.0;
        double expResult = 2.0;
        double result = Calculator.squareRoot(number);
        assertEquals(expResult, result, 0.0);

        number = -4.0;
        expResult = -1.0;
        result = Calculator.squareRoot(number);
        assertEquals(expResult, result, 0.0);

        number = 0.0;
        expResult = 0.0;
        result = Calculator.squareRoot(number);
        assertEquals(expResult, result, 0.0);
    }
}
