package org.calculator.model.processLogger;

public class MultiplicationProcessLogger extends AbstractProcessLogger{
    public MultiplicationProcessLogger(Object previousResult, String numberType) {
        super(previousResult, "multiplication", numberType);
    }
}
