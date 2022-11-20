package org.calculator.model.command.operation;

import org.calculator.model.Calculator;
import org.calculator.model.CalculatorSetter;
import org.calculator.model.command.OperationCommand;
import org.calculator.model.processLogger.AdditionProcessLogger;
import org.calculator.model.processLogger.MultiplicationProcessLogger;

public class MultiplicationCommand implements OperationCommand {
    @Override
    public void executeOperation(Calculator calculator, CalculatorSetter calculatorSetter, Number number) {
        if(calculator.getPreviousResult().equals(0.0)) {
            calculatorSetter.setPreviousResult(1.0);
        }
        calculatorSetter.setResult(calculator.getPreviousResult() * number.doubleValue());
        calculatorSetter.setPreviousResult(calculator.getResult());
        calculator.getPreviouslyResults().add(new MultiplicationProcessLogger(calculator.getResult(), "Double"));

    }
}
