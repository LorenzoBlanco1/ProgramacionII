package com.mycompany.tp5;
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario3 usuario3) {
        // Crea la instancia localmente.
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario3);
        System.out.println("Se genero correctamente el QR");
        return nuevoCodigo;
    }
    
    
}
