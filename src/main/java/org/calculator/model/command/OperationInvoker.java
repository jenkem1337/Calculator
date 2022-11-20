package org.calculator.model.command;

import org.calculator.model.Calculator;
import org.calculator.model.CalculatorSetter;
import org.calculator.model.Operation;

import java.util.HashMap;
import java.util.Map;

public class OperationInvoker {
    private Map<Operation, OperationCommand> operationCommandMap = new HashMap<>();

    public void invokeOperationCommand(Calculator calculator, CalculatorSetter calculatorSetter, Operation operation, Number number){
        if(!operationCommandMap.containsKey(operation)) {
            throw new RuntimeException("This command doesnt exist");
        }
        OperationCommand operationCommand = operationCommandMap.get(operation);
        operationCommand.executeOperation(calculator, calculatorSetter, number);
    }

    public void put(Operation operation, OperationCommand operationCommand) {
        operationCommandMap.put(operation, operationCommand);
    }
}
