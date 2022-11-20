package org.calculator.model.factory;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Calculator;

public class BasicCalculatorFactory implements CalculatorFactory{

    @Override
    public Calculator crateInstanceWithoutParameters() {
        return new BasicCalculator();
    }

    @Override
    public Calculator crateInstanceWithParameters(InstanceFactoryParameterConstructorStrategy<Calculator> strategy, Object... args ) {
        return strategy.getInstanceWithParameter(args);
    }
}
