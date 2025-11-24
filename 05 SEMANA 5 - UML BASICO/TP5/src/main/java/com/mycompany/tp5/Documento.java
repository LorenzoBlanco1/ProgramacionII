
package com.mycompany.tp5;
public class Documento {
  
    private String titulo; 
    private String contenido;
    private FirmaDigital firmaDigital;
    private Usuario1 usuario1;
    
    public Documento(String titulo, String contenido, String codigoHash, String
            fecha, Usuario1 usuario1) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null){
        this.titulo = titulo;}
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        if (contenido != null){
        this.contenido = contenido;}
    }

    public FirmaDigital getFirmaDigital(){
        return firmaDigital;
    }
    
    public void setFirmaDigital(String codigoHash, String fecha){
        this.firmaDigital.setCodigoHash(codigoHash);
        this.firmaDigital.setFecha(fecha);
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + 
                ", "+ firmaDigital + '}';
    }
    
    
    
}
