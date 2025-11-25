
package com.mycompany.excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionSegura {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("División Segura");
            System.out.print("Ingrese el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            
            System.err.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            
            System.err.println("Error: Debe ingresar números enteros.");
        }
    }

}
