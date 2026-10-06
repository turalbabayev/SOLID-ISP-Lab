package com.example.gitdemo.Calculate;

public class CalculatorMain {

    public static void main(String[] args) {

        BasicCalculator basic = new BasicCalculator();
        ScientificCalculator scientific = new ScientificCalculator();
        ProgrammingCalculator programming = new ProgrammingCalculator();

        System.out.println("=== BASIC CALCULATOR ===");
        System.out.println("10 + 5 = " + basic.add(10, 5));
        System.out.println("10 - 5 = " + basic.subtract(10, 5));

        System.out.println("\n=== SCIENTIFIC CALCULATOR ===");
        System.out.println("√25 = " + scientific.sqrt(25));
        System.out.println("log(100) = " + scientific.log(100));

        System.out.println("\n=== PROGRAMMING CALCULATOR ===");
        System.out.println("5 AND 3 = " + programming.and(5, 3));
        System.out.println("5 OR 3 = " + programming.or(5, 3));
        System.out.println("5 XOR 3 = " + programming.xor(5, 3));
    }
}