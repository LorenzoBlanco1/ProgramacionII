package com.mycompany.tp5;
public class FirmaDigital {    
    
    private String codigoHash; 
    private String fecha; 
    private Usuario1 usuario1; 
    
    public FirmaDigital(String codigoHash, String fecha, Usuario1 usuario1) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario1 = usuario1;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        if (codigoHash != null){
        this.codigoHash = codigoHash;}
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null){
        this.fecha = fecha;}
    }
    
    public Usuario1 getUsuario1(){
        return usuario1; 
    }
    
    public void setUsuario1(String nombre, String email){
        this.usuario1.setNombre(nombre);
        this.usuario1.setEmail(email);
    }
    
    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
