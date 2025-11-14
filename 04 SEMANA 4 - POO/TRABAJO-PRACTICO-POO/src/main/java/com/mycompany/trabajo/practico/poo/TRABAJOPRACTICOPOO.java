
package com.mycompany.trabajo.practico.poo;

public class TRABAJOPRACTICOPOO {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Lorenzo", "Administrativo", 1100000.00);
        System.out.println("Empleado " + empleado1);
        System.out.println("Total de empleados: " + empleado1.getTotalEmpleados());
        
        Empleado empleado2 = new Empleado(1, "Joan", "Administrativo", 1100000.00);
        System.out.println("Empleado " + empleado2);
        System.out.println("Total de empleados: " + empleado1.getTotalEmpleados());
        
        Empleado empleado3 = new Empleado(1, "Belen", "Vendendora", 600000.00);
        System.out.println("Empleado " + empleado3);
        System.out.println("Total de empleados: " + empleado1.getTotalEmpleados());
        
        System.out.println("Actualización de salarios: ");
        
        empleado1.actualizarSalario(100.0);
        System.out.println("Empleado " + empleado1);
        
        empleado2.actualizarSalario(1.0);
        System.out.println("Empleado " + empleado2);
        
        empleado3.actualizarSalario(1000.0);
        System.out.println("Empleado " + empleado3);
    }
}
