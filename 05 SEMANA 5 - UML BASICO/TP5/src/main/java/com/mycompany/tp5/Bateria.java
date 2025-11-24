
package com.mycompany.tp5;
public class Bateria {
    private String modelo; 
    private int capacidad; 
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (modelo != null){
        this.modelo = modelo;}
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        if (capacidad > 0){
        this.capacidad = capacidad;}
    }
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
}
