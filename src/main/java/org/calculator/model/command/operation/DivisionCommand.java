package org.calculator.model.command.operation;

import org.calculator.model.Calculator;
import org.calculator.model.CalculatorSetter;
import org.calculator.model.command.OperationCommand;
import org.calculator.model.processLogger.AdditionProcessLogger;
import org.calculator.model.processLogger.DivisionProcessLogger;

public class DivisionCommand implements OperationCommand {
    @Override
    public void executeOperation(Calculator calculator, CalculatorSetter calculatorSetter, Number number) {
        calculatorSetter.setResult(calculator.getPreviousResult() / number.doubleValue());
        calculatorSetter.setPreviousResult(calculator.getResult());
        calculator.getPreviouslyResults().add(new DivisionProcessLogger(calculator.getResult(), "Double"));

    }
}
