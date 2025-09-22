
package trabajo.practico.pkg2;

import java.util.Scanner;


public class TrabajoPractico2 {
    static Scanner input = new Scanner(System.in);
    static double DESCUENTO = 0.10;
    public static void main(String[] args) {
        
        int anio;
        System.out.println("A continuacion se perdira el ingreso de un anio. ");
        anio = validar_Positivo();
        if (es_Bisiesto(anio)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else { System.out.println("El anio " + anio + " no es bisiesto.");}
        
        int numero1, numero2, numero3, mayor;
        System.out.println("A continuacion se pediran 3 numeros y se devolvera el mayor.");
        numero1 = validar_Positivo();
        numero2 = validar_Positivo();
        numero3 = validar_Positivo();
        
        mayor = mayor_De_Tres(numero1, numero2, numero3);
        System.out.println("El mayor es: " + mayor);
        
        
        int edad;
        String clasificacion;
        System.out.println("A continuacion se pedira la edad para clasificarla. ");
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        clasificacion = clasificacion_Edad(edad);
        System.out.println("La clasificacion que corresponde a la edad " + edad + " es " + clasificacion);
        
        
        double monto_Base, monto_Descuento;
        char categoria; 
        System.out.println("A continuacion se pedira que ingrese un monto y la categoria del producto para aplicar un descuento en caso de que corresponda. ");
        System.out.println("Ingrese un monto: ");
        monto_Base = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la categoria ('A', 'B', 'C'):");
        categoria = input.nextLine().charAt(0);
        monto_Descuento = calcular_Descuento(monto_Base, categoria);
        System.out.println("El monto base es: $" + monto_Base);
        System.out.println("El monto con descuento es $" + monto_Descuento);
        
        int suma;
        System.out.println("A continuacion se pedira que se ingrese una secuencia de numeros y se sumaran los pares. ");
        suma = suma_Pares();
        System.out.println("La suma de los numeros pares ingresados es: " + suma);
        
        System.out.println("A continuacion se ingresaran 10 numero y se contara la cantidad de positivos, negativos y ceros. ");
        int positivos, negativos, ceros, numero_actual;
        positivos = negativos = ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero_actual = Integer.parseInt(input.nextLine());
            if (numero_actual == 0) {
                ceros += 1;
            } else if (numero_actual < 0) {negativos += 1; 
            } else {positivos += 1; }
        }
        System.out.println("La cantidad de positivos es: " + positivos);
        System.out.println("La cantidad de negativos es: " + negativos);
        System.out.println("La cantidad de ceros es: " + ceros);
        
        double nota; 
       
        do {
            System.out.println("Ingrese una nota: ");
            nota = Double.parseDouble(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("La nota que se ha ingresado es incorrecta, intente nuevamente. ");
            }
        } while ( nota < 0 || nota > 10) ;
        System.out.println("La nota es: " + nota);
        
        
       double precioFinal, precioBase, impuesto, descuento; 
        System.out.println("Ingrese el precio base: ");
        precioBase = Double.parseDouble(input.nextLine()); 
        while (precioBase < 0) {
            System.out.println("El precio base ingresado es incorrecto, ingrese nuevamente: ");
            precioBase = Double.parseDouble(input.nextLine()); 
        } 
        System.out.println("Ingrese el porcentaje de impuestos: ");
        impuesto = Double.parseDouble(input.nextLine()); 
        while (impuesto < 0) {
            System.out.println("El impuesto ingresado es incorrecto, ingrese nuevamente: ");
            impuesto = Double.parseDouble(input.nextLine()); 
        } 
        System.out.println("Ingrese el porcentaje de descuentos: ");
        descuento = Double.parseDouble(input.nextLine()); 
        while (descuento < 0 ) {
            System.out.println("El descuento ingresado no es valido, ingrese nuevamente:");
            descuento = Double.parseDouble(input.nextLine());
        }
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final es $" + precioFinal);
        
        
        
        double precioProducto, costoEnvio, peso, total; 
        String zona;
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona ('Nacional' o 'Internacional': ");
        zona = input.nextLine();
        System.out.println("Ingrese el peso del producto: ");
        peso = Double.parseDouble(input.nextLine()); 
        costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El precio del producto es $" + precioProducto);
        System.out.println("El costo del envio es $" + costoEnvio);
        total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El precio total de la compra es $" + total);
        
        
        int stock, stockVendido, stockRecibido;
        System.out.println("Ingrese el stock del producto; ");
        stock = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        stockVendido = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        stockRecibido = Integer.parseInt(input.nextLine());
        stock = actualizarStock(stock, stockVendido, stockRecibido); 
        System.out.println("El stock actualizado es: " + stock);
        
        
        double precioSinDescuento, descuentoAplicado;
        System.out.println("Ingrese el precio del producto: ");
        precioSinDescuento = Double.parseDouble(input.nextLine()); 
        System.out.println("El precio sin descuento es $" + precioSinDescuento);
        descuentoAplicado = calcularDescuentoEspecial(precioSinDescuento); 
        
        
        
        double[] preciosArray = {199.99, 299.5, 149.175, 399.0, 89.99};
        System.out.println("Precios originales: ");
        for (double precio:preciosArray) {
            System.out.println("Precio $" + precio);
        }
        preciosArray[2] = 129.99;
        System.out.println("Precios modificados: ");
        for (double precio:preciosArray) {
            System.out.println("Precio $" + precio);
        }
        
        
        }
    
    
    // Funciones;
    
    static int validar_Positivo() {
        int num;
        System.out.println("Ingrese un numero positivo: ");
        num = Integer.parseInt(input.nextLine());
        while (num < 0) {
            System.out.println("El numero ingresado debe ser positivo.");
            num = Integer.parseInt(input.nextLine());}
        return num;}
    
    
    static boolean es_Bisiesto(int anio){
        boolean bisiesto = false;
        if (anio % 4 == 0 && anio % 100 != 0 && anio % 400 != 0) {
            bisiesto = true; 
        } 
        return bisiesto;}
    
    static int mayor_De_Tres(int numero1, int numero2, int numero3) {
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                return numero1;
            } else {return numero3;}
            
        } else {
            if (numero2 > numero3) {
                return numero2;
            } else {return numero3;}
        }
    }
      
    static String clasificacion_Edad(int edad) {
        if (edad < 12) {return "Niño";
        } else if (edad >= 12 && edad <= 17) {return "Adolecente";
        } else if (edad >= 18 && edad <= 59) {return "Adulto";
        } else{ return "Adulto mayor";}
    }
    
    static double calcular_Descuento(double monto, char categoria) {
        if (categoria == 'A') {
            monto = monto - ((monto / 100) *10);
            return monto;
        } else if (categoria == 'B') {
            monto = monto - ((monto / 100) * 15);
            return monto;
        } else if (categoria == 'C') {
            monto = monto - ((monto / 100) * 20);
            return monto;
        } return monto;}
    
    static int suma_Pares() {
        int numero, suma;
        numero = -1;
        suma = 0;
        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.println("Ingrese 0 para salir. ");
            numero = validar_Positivo();
        } return suma;}
        
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;
        precioFinal = precioBase + (precioBase * impuesto/100) - (precioBase * descuento/100);
        return precioFinal;
    }

    static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio;
        costoEnvio = 0;
        if (zona.equals("Nacional")) {
            costoEnvio = peso * 5;
            return costoEnvio;
        } else if (zona.equals("Internacional")){
            costoEnvio = peso * 10;
            return costoEnvio;
        }
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double totalCompra;
        totalCompra = precioProducto + costoEnvio;
        return totalCompra;
    }
    
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock;
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida; 
        return nuevoStock;
    }
    
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado, precioConDescuento;
        descuentoAplicado = precio * DESCUENTO;
        precioConDescuento = precio - (precio * DESCUENTO); 
        System.out.println("El decuento aplicado es $" + descuentoAplicado);
        System.out.println("El precio final con descuento aplicad es $" + precioConDescuento);
    return descuentoAplicado;
    }
    
}
    
    
        
        


