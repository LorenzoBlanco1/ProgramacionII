
package com.mycompany.trabajo.practico.poo;

public class Empleado {
    private int id; 
    private String nombre;
    private String puesto;
    private Double salario;
    private static int totalEmpleados; 
    
    //Constructor.
    public Empleado(int id, String nombre, String puesto, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados ++;
    }
    
    //Sobrecarga de constructor.
    public Empleado(String nombre, String puesto) {
        this(10, nombre, puesto, 500.00);
    }
    
    //Getters y Setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSalario() {
        return salario;
    }
    
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
    public void actualizarSalario(int porcentaje) {
        if (porcentaje >= 0) {
            this.salario *= (1 + porcentaje / 100.0);
        }
    }
    
    public void actualizarSalario(double cantidad) {
        if (cantidad >= 0){
            this.salario += cantidad;
        }
    }
    
    
    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id = " + id + ", nombre = " + nombre + ", puesto = " + puesto + ", salario = $" + salario + '}';
    }
    
    
    
}
