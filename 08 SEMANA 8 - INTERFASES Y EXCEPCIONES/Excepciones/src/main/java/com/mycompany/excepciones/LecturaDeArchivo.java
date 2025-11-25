
package com.mycompany.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {

    public static void main(String[] args) {
        String nombreArchivo = "archivo_inexistente.txt";
        BufferedReader br = null; 

        try {
            System.out.println("Lectura de Archivo:");

            br = new BufferedReader(new FileReader(nombreArchivo));

            System.out.println("Archivo '" + nombreArchivo + "' encontrado. Contenido:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("No se encontro el archivo '" + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error general: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el recurso: " + e.getMessage());
            }
        }
    }
}
