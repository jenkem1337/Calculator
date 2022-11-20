package org.calculator.model.processLogger;

public abstract class AbstractProcessLogger implements CalculatorProcessLogger {

    private Object previousResult;
    private String numberType;
    private String processType;

    public AbstractProcessLogger(Object previousResult, String processType, String numberType) {
        this.previousResult = previousResult;
        this.numberType = numberType;
        this.processType = processType;
    }

    @Override
    public Object getPreviousResult() {
        return previousResult;
    }

    @Override
    public String getNumberType() {
        return numberType;
    }

    @Override
    public String getProcessType() {
        return processType;
    }
    @Override
    public String toString(){
        return "Previous result -> " + getPreviousResult() + "\n" + "Process type -> " + getProcessType() +"\n" + "Number type -> " + getNumberType();
    }
}
