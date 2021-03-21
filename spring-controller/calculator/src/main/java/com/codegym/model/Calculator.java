package com.codegym.model;

public class Calculator {
    private float firstOperand;
    private float secondOperand;
    private char operator;
    private float total;

    public Calculator() {
    }

    public Calculator(float firstOperand, float secondOperand, float total) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.total = total;
    }

    public Calculator(float firstOperand, float secondOperand, char operator, float total) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
        this.total = total;
    }

    public float getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(float firstOperand) {
        this.firstOperand = firstOperand;
    }

    public float getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(float secondOperand) {
        this.secondOperand = secondOperand;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstOperand=" + firstOperand +
                ", secondOperand=" + secondOperand +
                ", total=" + total +
                '}';
    }
}
