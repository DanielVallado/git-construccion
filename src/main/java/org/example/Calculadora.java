package org.example;


public class Calculadora {

    public static double calcularPotencia(double numero1, double numero2) throws ArithmeticException {
        try {
            return Math.pow(numero1, numero2);
        } catch (ArithmeticException e) {
            throw new NumberFormatException("Los valores deben ser números válidos.");
            return null;
        }
    }
}