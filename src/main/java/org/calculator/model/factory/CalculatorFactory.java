package org.calculator.model.factory;

import org.calculator.model.Calculator;

public interface CalculatorFactory {
    Calculator crateInstanceWithoutParameters();
    Calculator crateInstanceWithParameters(InstanceFactoryParameterConstructorStrategy<Calculator> strategy, Object... args);
}
