
package com.mycompany.excepciones;

import java.util.Scanner;

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String message) {
        super(message);
    }
}

public class ExcepcionPersonalizada {

    public static void registrarUsuario(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " está fuera del rango válido (0-120).");
        }
        System.out.println("Edad " + edad + " registrada correctamente.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Excepción Personalizada: ");
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();

            registrarUsuario(edad);

        } catch (EdadInvalidaException e) {
            System.err.println("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error de entrada: " + e.getMessage());
        }
    }
}
    
    
    

