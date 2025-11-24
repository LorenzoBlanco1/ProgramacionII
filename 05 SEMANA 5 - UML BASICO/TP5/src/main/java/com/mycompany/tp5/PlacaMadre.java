package com.mycompany.tp5;
public class PlacaMadre {
    
    private String modelo; 
    private String chipset; 

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null){
        this.modelo = modelo;}
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        if (chipset != null){
        this.chipset = chipset;}
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    
    
    
}
