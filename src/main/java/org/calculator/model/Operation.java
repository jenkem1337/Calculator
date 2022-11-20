package org.calculator.model;

public enum Operation {
    SUBTRACTION("SUBTRACTION"),
    ADDITION("ADDITION"),
    MULTIPLICATION("MULTIPLICATION"),
    DIVISION("DIVISION");
    private final String operation;

    Operation(String operation) {
        this.operation = operation;
    }
    public String operation(){return operation;}
}


