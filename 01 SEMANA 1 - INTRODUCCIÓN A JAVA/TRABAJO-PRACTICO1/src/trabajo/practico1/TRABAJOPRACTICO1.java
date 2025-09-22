
package trabajo.practico1;
import java.util.Scanner;


public class TRABAJOPRACTICO1 {

    public static void main(String[] args) {
        String nombre = "Lorenzo";
        int edad = 21;
        double altura = 1.78;
        boolean estudiante = true;
        
        System.out.println("Hola, " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Mides " + altura + " metreos.");
        System.out.println("It is " + estudiante + " you are student");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Su edad es "+ edad);
        
        
        
        
        
        
    }
    
}
