package com.mycompany.tp5;
public class Usuario1 {
    
    private String nombre; 
    private String email;

    public Usuario1(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;}
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null){
        this.email = email;}
    }
    
    
    @Override
    public String toString() {
        return "Usuario1{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    
    
}
