
package com.mycompany.excepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryConRecursos {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        System.out.println("Leer archivo: ");

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Leyendo archivo '" + nombreArchivo);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("No se pudo procesar el archivo: " + e.getMessage());
        }
    }
}

