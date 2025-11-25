package com.mycompany.sistema.ecomerce;
class PayPal implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95;
    }
    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago con PayPal...");
        System.out.println("Monto Original: $" + monto + " | Descuento aplicado: $" + (monto - montoFinal));
        System.out.println("TOTAL A PAGAR: $" + montoFinal);
        System.out.println("Pago Aprobado.");
    }
}
