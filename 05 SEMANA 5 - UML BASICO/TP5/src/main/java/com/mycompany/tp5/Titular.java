
package com.mycompany.tp5;
public class Titular {
    private String nombre; 
    private int dni;
    private Pasaporte pasaporte; 

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;
        }
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        if (dni > 9999999){
            this.dni = dni;
            }
    }
    
    public Pasaporte getPasaporte(){
            return pasaporte;
        }
    public void setPasaporte(Pasaporte pasaporte) {
            this.pasaporte = pasaporte; 
            if (pasaporte != null && pasaporte.getTitular() != this) {
                pasaporte.setTitular(this);
            }
        }
    
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}
