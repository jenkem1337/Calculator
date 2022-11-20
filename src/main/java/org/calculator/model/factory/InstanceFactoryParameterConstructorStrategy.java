package org.calculator.model.factory;

public interface InstanceFactoryParameterConstructorStrategy<T> {
    T getInstanceWithParameter(Object ...args);
}
