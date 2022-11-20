package org.calculator.model;

import org.calculator.model.command.OperationInvoker;
import org.calculator.model.command.operation.AdditionCommand;
import org.calculator.model.command.operation.DivisionCommand;
import org.calculator.model.command.operation.MultiplicationCommand;
import org.calculator.model.command.operation.SubtractionCommand;
import org.calculator.model.processLogger.*;

import java.util.ArrayList;
import java.util.List;

import static org.calculator.model.Operation.*;

public class BasicCalculator implements Calculator, CalculatorSetter {
    private Double previousResult;
    private Double result;
    private OperationInvoker operationInvoker;
    private List<CalculatorProcessLogger> previouslyResults;

    public BasicCalculator() {
        this.previousResult = 0.0;
        this.result = 0.0;
        operationInvoker = new OperationInvoker();
        operationInvoker.put(ADDITION, new AdditionCommand());
        operationInvoker.put(SUBTRACTION, new SubtractionCommand());
        operationInvoker.put(MULTIPLICATION, new MultiplicationCommand());
        operationInvoker.put(DIVISION, new DivisionCommand());

        this.previouslyResults = new ArrayList<>();
    }
    public BasicCalculator(Double initialValue){
        this.previousResult = initialValue;
        this.result = 0.0;
        operationInvoker = new OperationInvoker();
        operationInvoker.put(ADDITION, new AdditionCommand());
        operationInvoker.put(SUBTRACTION, new SubtractionCommand());
        operationInvoker.put(MULTIPLICATION, new MultiplicationCommand());
        operationInvoker.put(DIVISION, new DivisionCommand());

        this.previouslyResults = new ArrayList<>();

    }

    public <T extends Number> void executeProcess(Operation operation, T number){
        operationInvoker.invokeOperationCommand(this, this, operation, number);
    }

    public void resetResult() {
        result = 0.0;
    }

    public Double getResult() {
        return result;
    }


    public Double getPreviousResult() {
        return previousResult;
    }

    public List<CalculatorProcessLogger> getPreviouslyResults() {
        return previouslyResults;
    }

    public void setPreviousResult(Double previousResult) {
        this.previousResult = previousResult;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public void setPreviouslyResults(List<CalculatorProcessLogger> previouslyResults) {
        this.previouslyResults = previouslyResults;
    }


}
