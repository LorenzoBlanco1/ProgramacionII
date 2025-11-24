
package com.mycompany.tp5;
public class Pasaporte {
    private int numero; 
    private String fechaEmision; 
    private Foto foto;
    private Titular titular;
    public Pasaporte(int numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
    public String getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(String fechaEmision) {
        if (fechaEmision != null){
        this.fechaEmision = fechaEmision;}
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); 
        }
    }
    
    
    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + 
                fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
    
    
    
    
}
