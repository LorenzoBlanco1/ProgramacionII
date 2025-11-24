
package com.mycompany.tp5;
public class Vehiculo {
    private String patente; 
    private String modelo; 
    private Motor motor; 
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; 
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente != null){
        this.patente = patente;}
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null){
        this.modelo = modelo;}
    }
    
    public Motor getMotor(){
        return motor;
    }
    
    public Conductor getConductor(){
        return conductor; 
        }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + '}';
    }
    
    
    
}
