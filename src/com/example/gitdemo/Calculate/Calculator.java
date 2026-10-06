package com.example.gitdemo.Calculate;

public interface Calculator {

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    double sqrt(double number);
    double log(double number);
    double sin(double number);
    double cos(double number);

    int and(int a, int b);
    int or(int a, int b);
    int xor(int a, int b);
}