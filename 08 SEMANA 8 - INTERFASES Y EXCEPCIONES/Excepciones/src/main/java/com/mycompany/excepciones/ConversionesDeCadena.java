
package com.mycompany.excepciones;
import java.util.Scanner;

public class ConversionesDeCadena {

    public static void main(String[] args) {
        String texto = null;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Conversion de cadena: ");
            System.out.print("Ingrese un texto: ");

            texto = scanner.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.err.println("El valor '" + texto + "' no es un número entero válido.");
        }
    }
}
