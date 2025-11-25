package com.mycompany.sistema.ecomerce;
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}
