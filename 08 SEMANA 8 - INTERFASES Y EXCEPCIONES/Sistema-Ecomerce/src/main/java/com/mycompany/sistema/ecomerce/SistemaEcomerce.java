
package com.mycompany.sistema.ecomerce;
public class SistemaEcomerce {
       
    public static void main(String[] args) {
        // Crear Cliente. 
        Cliente cliente1 = new Cliente("Lorenzo Blanco", "Blancolorenzo139@gmail.");

        // Crear Pedido.
        Pedido pedido1 = new Pedido(cliente1);

        // Crear Productos. 
        Producto p1 = new Producto("Computadora de Escritorio", 1500000.0);
        Producto p2 = new Producto("Microfono", 5000.0);

        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);

        // Calcular Total Usuarios con la interfaz Pagable. 
        double totalDelPedido = pedido1.calcularTotal();
        System.out.println("El total del pedido es: $" + totalDelPedido);

        // Procesar Pago sin Descuento. 
        Pago medioDePago1 = new TarjetaCredito();
        medioDePago1.procesarPago(totalDelPedido);

        System.out.println("----");

        // Pago con descuento
        PagoConDescuento medioDePago2 = new PayPal();
        medioDePago2.procesarPago(totalDelPedido);

        // Tarea 5: Notificar cambio de estado
        pedido1.setEstado("ENVIADO");
    }
    
}
