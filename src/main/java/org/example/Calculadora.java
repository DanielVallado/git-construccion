package org.example;

public class Calculadora{
    public static int calcularModulo(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numero1 % numero2;
    }
}

    