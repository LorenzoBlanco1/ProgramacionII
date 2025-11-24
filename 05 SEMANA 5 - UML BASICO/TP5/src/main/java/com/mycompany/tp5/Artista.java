
package com.mycompany.tp5;
public class Artista {
    
    private final String nombre;
    private final String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista [nombre=" + nombre + ", genero=" + genero + "]";
    }
}