package org.calculator.model.factory;

import org.calculator.model.BasicCalculator;
import org.calculator.model.Calculator;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFactoryContext {
    private Map<String, CalculatorFactory> calculatorHashMap;
    private Map<String, InstanceFactoryParameterConstructorStrategy> constructorParameterStrategy;
    public CalculatorFactoryContext(){
        calculatorHashMap = new HashMap<>();
        constructorParameterStrategy = new HashMap<>();
        constructorParameterStrategy.put(BasicCalculatorSecondConstructor.class.getSimpleName(), new BasicCalculatorSecondConstructor());
        calculatorHashMap.put(BasicCalculator.class.getSimpleName(), new BasicCalculatorFactory());
    }
    public Calculator createInstanceOf(Class<?> clazz){
        if(!calculatorHashMap.containsKey(clazz.getSimpleName())){
            throw new RuntimeException("This factory doesnt exist");
        }
        CalculatorFactory factory = calculatorHashMap.get(clazz.getSimpleName());

        return factory.crateInstanceWithoutParameters();
    }
    public Calculator createInstanceOf(Class<?> clazz, Class<?> strategyClazz, Object... args){
        if(!calculatorHashMap.containsKey(clazz.getSimpleName())){
            throw new RuntimeException("This factory doesnt exist");
        }
        CalculatorFactory factory = calculatorHashMap.get(clazz.getSimpleName());
        InstanceFactoryParameterConstructorStrategy<Calculator> strategy  = constructorParameterStrategy.get(strategyClazz.getSimpleName());
        return factory.crateInstanceWithParameters(strategy, args);
    }

}
