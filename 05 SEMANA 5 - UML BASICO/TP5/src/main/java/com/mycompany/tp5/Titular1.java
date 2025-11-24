package com.mycompany.tp5;
public class Titular1 {
    private String nombre; 
    private int dni; 
    private CuentaBancaria cuentaBancaria;
    
    public Titular1(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;}

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public int getDni() {
        return dni;}

    public void setDni(int dni) {
        this.dni = dni;}
    
    public CuentaBancaria getCuentaBancaria(){
        return cuentaBancaria;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria; 
        if (cuentaBancaria != null && cuentaBancaria.getTitular1() != this){
            cuentaBancaria.setTitular1(this);
        }
    }
    
    @Override
    public String toString() {
        return "Titular1{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
    
}
