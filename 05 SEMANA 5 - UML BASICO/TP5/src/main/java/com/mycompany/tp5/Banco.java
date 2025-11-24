package com.mycompany.tp5;
public class Banco {
    private String nombre; 
    private String cuit; 
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;}
    }
    public String getCuit() {
        return cuit;
    }
    public void setCuit(String cuit) {
        if (cuit != null){
        this.cuit = cuit;}
    }
    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
    
    
}
