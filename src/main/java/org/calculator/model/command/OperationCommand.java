package org.calculator.model.command;

import org.calculator.model.Calculator;
import org.calculator.model.CalculatorSetter;

public interface OperationCommand {
    void executeOperation(Calculator calculator, CalculatorSetter calculatorSetter, Number number);
}
