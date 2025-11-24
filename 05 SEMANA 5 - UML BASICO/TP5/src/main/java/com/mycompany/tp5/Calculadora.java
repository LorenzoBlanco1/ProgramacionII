
package com.mycompany.tp5;
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        // Simula un cálculo complejo.
        double total = impuesto.getMonto() * 1.21;
        System.out.println("Calcular: " + impuesto.toString());
        System.out.println("Total: " + total);
    }
}

