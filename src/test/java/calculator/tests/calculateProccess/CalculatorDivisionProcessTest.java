package calculator.tests.calculateProccess;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Operation;
import org.calculator.model.factory.BasicCalculatorSecondConstructor;
import org.calculator.model.factory.CalculatorFactoryContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorDivisionProcessTest {
    private CalculatorFactoryContext ctx;

    @BeforeEach
    void setUp() {
        ctx = new CalculatorFactoryContext();
    }

    @AfterEach
    void tearDown() {
        ctx = null;
    }

    @Test
    public void itShouldReturnCorrectValueWhenGivenValidValueAsInteger() {
        var calculator = ctx.createInstanceOf(
                BasicCalculator.class,
                BasicCalculatorSecondConstructor.class,
                new Double(15).doubleValue());
        calculator.executeProcess(Operation.DIVISION, 3);
        var expected = 5D;
        assertEquals(calculator.getResult(), expected);
    }

    @Test
    public void itShouldReturnCorrectWithDefaultValueWhenGivenValidValueAsInteger() {
        var calculator = ctx.createInstanceOf(BasicCalculator.class, BasicCalculatorSecondConstructor.class, 1.0);
        calculator.executeProcess(Operation.DIVISION, 10);
        var expected = 0.1;
        assertEquals(calculator.getResult(), expected);
    }

    @Test
    void itShouldReturnNegativeValueWhenGivenNegativeAndPositiveTwoValueAsInteger() {
        var calculator = ctx.createInstanceOf(
                BasicCalculator.class,
                BasicCalculatorSecondConstructor.class,
                new Double(-30).doubleValue());
        calculator.executeProcess(Operation.DIVISION, 5);
        var expected = -6.0;
        assertEquals(calculator.getResult(), expected);
    }

    @Test
    void itShouldReturnPositiveValueWhenGivenNegativeTwoValueAsInteger() {
        var calculator = ctx.createInstanceOf(
                BasicCalculator.class,
                BasicCalculatorSecondConstructor.class,
                new Double(-30).doubleValue());
        calculator.executeProcess(Operation.DIVISION, -5);
        var expected = 6.0;
        assertEquals(calculator.getResult(), expected);
    }

    @Test
    public void itShouldReturnNaN_WhenDivideZero(){
            var calculator = ctx.createInstanceOf(BasicCalculator.class);
            calculator.executeProcess(Operation.DIVISION, 0.0);
            assertEquals(calculator.getResult(), Double.NaN);

    }

}