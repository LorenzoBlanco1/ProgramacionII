package com.mycompany.tp5;
public class Cliente2 {
    
    private String nombre; 
    private int telefono; 

    public Cliente2(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;}
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (telefono > 0){
        this.telefono = telefono;}
    }

    @Override
    public String toString() {
        return "Cliente2{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
}
