package com.mycompany.tp5;
public class Computadora {
    
    private String marca; 
    private int numeroSerie; 
    private PlacaMadre placaMadre;
    private Propietario propietario; 
    
    public Computadora(String marca, int numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null){
        this.marca = marca;}
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        if (numeroSerie > 0){
        this.numeroSerie = numeroSerie;}
    }
  
    public Propietario getPropietario(){
        return propietario; 
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario; 
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
     @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie +
                ", " + placaMadre + ", " + propietario + '}';
    }
    
}
