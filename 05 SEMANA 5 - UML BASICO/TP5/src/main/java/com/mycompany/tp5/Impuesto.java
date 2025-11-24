
package com.mycompany.tp5;
public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }
    
    @Override
    public String toString() {
        return "Impuesto [monto=" + monto + ", contribuyente=" + contribuyente + "]";
    }
}

