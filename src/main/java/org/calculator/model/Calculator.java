package org.calculator.model;

import org.calculator.model.processLogger.*;

import java.util.List;

public interface Calculator {
    <T extends Number> void executeProcess(Operation caseValue, T number);

     void resetResult();
    Double getResult();

    Double getPreviousResult();

     List<CalculatorProcessLogger> getPreviouslyResults();

}
