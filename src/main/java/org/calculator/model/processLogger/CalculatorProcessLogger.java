package org.calculator.model.processLogger;

public interface CalculatorProcessLogger {
    Object getPreviousResult();
    String  getNumberType();
    String getProcessType();
}
