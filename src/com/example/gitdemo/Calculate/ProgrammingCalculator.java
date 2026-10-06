package com.example.gitdemo.Calculate;

public class ProgrammingCalculator implements ArithmeticOperations, BitwiseOperations {

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
    public int and(int a, int b) {
        return a & b;
    }

    @Override
    public int or(int a, int b) {
        return a | b;
    }

    @Override
    public int xor(int a, int b) {
        return a ^ b;
    }
}
