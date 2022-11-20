package org.calculator.model;

import org.calculator.model.processLogger.CalculatorProcessLogger;

import java.util.List;

public interface CalculatorSetter {
    void setPreviousResult(Double previousResult);

    void setResult(Double result) ;

    void setPreviouslyResults(List<CalculatorProcessLogger> previouslyResults);

}
