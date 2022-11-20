package org.calculator.model.processLogger;

public class AdditionProcessLogger extends AbstractProcessLogger{

    public AdditionProcessLogger(Object previousResult, String numberType) {
        super(previousResult, "addition", numberType);
    }
}
