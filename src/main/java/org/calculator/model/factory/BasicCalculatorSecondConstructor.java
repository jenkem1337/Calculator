package org.calculator.model.factory;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Calculator;

public class BasicCalculatorSecondConstructor implements InstanceFactoryParameterConstructorStrategy<Calculator>{

    @Override
    public Calculator getInstanceWithParameter(Object... args) {
        return new BasicCalculator((Double) args[0]);
    }
}
