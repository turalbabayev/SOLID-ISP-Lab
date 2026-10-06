package com.example.gitdemo.Calculate;

public class BasicCalculator implements Calculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double sqrt(double number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double log(double number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double sin(double number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double cos(double number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int and(int a, int b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int or(int a, int b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int xor(int a, int b) {
        throw new UnsupportedOperationException();
    }
}