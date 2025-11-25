
package com.mycompany.sistema.ecomerce;
class TarjetaCredito implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
        System.out.println("Pago Aprobado.");
    }
}
