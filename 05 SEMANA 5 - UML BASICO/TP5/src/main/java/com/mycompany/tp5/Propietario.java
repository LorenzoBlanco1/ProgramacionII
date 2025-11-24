package com.mycompany.tp5;
public class Propietario {
    
    private String nombre;
    private int dni; 
    private Computadora computadora; 
    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;}
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if (dni > 999999 && dni < 9999999){
        this.dni = dni;}
    }

    
    public Computadora getComputadora(){
        return computadora; 
    }
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora; 
        if (computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }
    
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}
