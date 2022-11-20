package calculator.tests.calculateProccess;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Operation;
import org.calculator.model.factory.CalculatorFactoryContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSubtractationProccessTest {
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
    public void itShouldReturnCorrectSubtractionValueWhenGivenValidValueWithSomeAdditionsAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.ADDITION, 12);
        calculator.executeProcess(Operation.ADDITION, 44);

        calculator.executeProcess(Operation.SUBTRACTION, 28);
        var expected = 28.0;
        assertEquals(calculator.getResult(), expected);
    }
    @Test
    public void itShouldReturnCorrectSubtractionValuesWhenGivenValidValueWithSomeAdditionsAsInteger(){
        var calculator = ctx.createInstanceOf(BasicCalculator.class);
        calculator.executeProcess(Operation.ADDITION, 12);
        calculator.executeProcess(Operation.ADDITION, 44);

        calculator.executeProcess(Operation.SUBTRACTION, 28);
        calculator.executeProcess(Operation.SUBTRACTION, 30);

        var expected = -2.0;
        assertEquals(calculator.getResult(), expected);
    }

}


