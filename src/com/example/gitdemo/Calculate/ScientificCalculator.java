package com.example.gitdemo.Calculate;

public class ScientificCalculator implements ArithmeticOperations, ScientificOperations {

    private final ArithmeticOperations arithmetic = new BasicCalculator();

    @Override
    public double add(double a, double b) {
        return arithmetic.add(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        return arithmetic.subtract(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        return arithmetic.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        return arithmetic.divide(a, b);
    }

    @Override
    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public double log(double number) {
        return Math.log10(number);
    }

    @Override
    public double sin(double number) {
        return Math.sin(number);
    }

    @Override
    public double cos(double number) {
        return Math.cos(number);
    }
}
