package org.example;
import org.example.Calculadora;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double numerador = 2.4;
        double denominador = 2.4;

        Calculadora operacion = new Calculadora( numerador , denominador);
        System.out.println(operacion.divison(2, 4));
        
    }

    


}