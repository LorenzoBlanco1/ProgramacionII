
package com.mycompany.kata3;

import java.util.ArrayList;
import java.util.List;


abstract class Empleado {
    private String nombre;
    public Empleado(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public abstract double calcularSueldo();
}

class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    public EmpleadoPlanta(String nombre, double sueldoBasico) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
    }
    @Override
    public double calcularSueldo() {
        return sueldoBasico;
    }
}

class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double precioPorHora;
    public EmpleadoTemporal(String nombre, int horas, double precio) {
        super(nombre);
        this.horasTrabajadas = horas;
        this.precioPorHora = precio;
    }
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * precioPorHora;
    }
}


public class Kata3 {
    public static void main(String[] args) {
        List<Empleado> nomina = new ArrayList<>();
        nomina.add(new EmpleadoPlanta("Lorenzo Blanco", 1100000.0));
        nomina.add(new EmpleadoTemporal("Javier Blanco", 160, 62500));
        nomina.add(new EmpleadoPlanta("Joan Blanco", 1100000.0));

        System.out.println("Liquidar Sueldos: ");
        double totalLiquidacion = 0;
        for (Empleado emp : nomina) {
            double sueldo = emp.calcularSueldo();
            System.out.println("Empleado: " + emp.getNombre() + ", Sueldo: $" + sueldo);
            totalLiquidacion += sueldo;
        }
        System.out.println("Total Liquidaciones: $" + totalLiquidacion);

        System.out.println("Clasificacion de empleados: ");
        int contPlanta = 0;
        int contTemporal = 0;
        for (Empleado emp : nomina) {
            if (emp instanceof EmpleadoPlanta) {
                contPlanta++;
            } else if (emp instanceof EmpleadoTemporal) {
                contTemporal++;
            }
        }
        System.out.println("Empleados de Planta: " + contPlanta);
        System.out.println("Empleados Temporales: " + contTemporal);
    }
}