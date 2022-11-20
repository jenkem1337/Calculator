package calculator.tests.calculateProccess;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Calculator;
import org.calculator.model.Operation;
import org.calculator.model.factory.CalculatorFactoryContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorMultiplicationProcessTest {
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
    public void itShouldReturnCorrectMultiplicationWhenGivenValidValueAsInteger(){

        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.MULTIPLICATION, 10);
        var expected = 10.0;
        assertEquals(calculator.getResult(), expected);

    }
    @Test
    public void itShouldReturnZeroWhenGivenNumberAsZeroAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.MULTIPLICATION, 0);
        var expected = 0.0;
        assertEquals(calculator.getResult(), expected);
    }

    @Test
    public void itShouldReturnZeroWhenOneMoreThanMultiplicationWithZeroAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.MULTIPLICATION, 123);
        calculator.executeProcess(Operation.MULTIPLICATION, 9403);
        calculator.executeProcess(Operation.MULTIPLICATION, 0);
        var expected = 0.0;
        assertEquals(calculator.getResult(), expected);
    }
    @Test
    public void itShouldReturnNegativeValueWhenGivenNegativeValueAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.MULTIPLICATION, 2);
        calculator.executeProcess(Operation.MULTIPLICATION, -2);
        var expected = -4.0;
        assertEquals(calculator.getResult(), expected);
    }
    @Test
    public void itShouldReturnPositiveValueWhenGivenFourPieceNegativeValueAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.MULTIPLICATION, -2);
        calculator.executeProcess(Operation.MULTIPLICATION, -2);
        calculator.executeProcess(Operation.MULTIPLICATION, -2);
        calculator.executeProcess(Operation.MULTIPLICATION, -2);

        var expected = 16.0;
        assertEquals(calculator.getResult(), expected);

    }
}
