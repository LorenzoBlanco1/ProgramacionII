
package com.mycompany.tp5;


public class Cliente {
    
    private String nombre; 
    private int dni; 
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, int dni) {
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
        if (dni > 9999999 && dni < 99999999)
        this.dni = dni;
    }
    
    public TarjetaDeCredito getTarjetaDeCredito(){
        return tarjetaDeCredito;
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this); 
        }
    }
    
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
