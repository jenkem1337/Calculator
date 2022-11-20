package calculator.tests.calculateProccess;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Operation;
import org.calculator.model.factory.BasicCalculatorSecondConstructor;
import org.calculator.model.factory.CalculatorFactoryContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAdditionProcessTest {
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
    public void itShouldReturnCorrectSumWhenGivenValidValueAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.ADDITION, 12);
        var expected = 12.0;
        assertEquals(calculator.getResult(), expected);
    }
    @Test
    public void itShouldReturnCorrectSumWhenGivenValidValuesAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.ADDITION, 12);
        calculator.executeProcess(Operation.ADDITION, 44);
        var expected = 56.0;
        assertEquals(calculator.getResult(), expected);
    }
    @Test
    public void itShouldReturnCorrectSumWhenGivenValidConstructorParameterAsInteger(){
        var calculator = ctx.createInstanceOf(
                BasicCalculator.class,
                BasicCalculatorSecondConstructor.class,
                new Double(10).doubleValue());

        calculator.executeProcess(Operation.ADDITION, 10);
        var expected = 20.0;
        assertEquals(calculator.getResult(), expected);
    }
}
