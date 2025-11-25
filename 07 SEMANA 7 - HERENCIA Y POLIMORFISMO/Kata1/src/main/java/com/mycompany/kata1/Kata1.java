
package com.mycompany.kata1;

class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public void mostrarInfo() {
        System.out.println("Vehiculo: " + this.marca + " " + this.modelo);
    }
}

class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + this.cantidadPuertas);
    }
}

public class Kata1 {
    public static void main(String[] args) {
        // Tarea: Instanciar un auto y mostrar su información completa.
        Auto miAuto = new Auto("Volskwagen", "Virtus", 5);
        miAuto.mostrarInfo();
    }
}