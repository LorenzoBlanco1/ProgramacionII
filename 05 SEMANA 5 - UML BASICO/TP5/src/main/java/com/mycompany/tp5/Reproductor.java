
package com.mycompany.tp5;
public class Reproductor {
    // Dependencia de Uso: 'cancion' solo existe dentro de este método.
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo ahora: " + cancion.toString());
    }
}

