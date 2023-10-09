package org.example;


public class Calculadora {
    double numerador;
    double denominador;
    public Calculadora(double numerador, double denominador){
        this.numerador = numerador;
        this.denominador = denominador;

    }
    public static double divison (double numerador, double denominador){
        return (numerador/denominador);
    }
}
