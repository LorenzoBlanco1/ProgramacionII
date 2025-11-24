
package com.mycompany.tp5;
public class CodigoQR {
    private String valor;
    private Usuario3 usuario3;

    public CodigoQR(String valor, Usuario3 usuario3) {
        this.valor = valor;
        this.usuario3 = usuario3;
    }

    @Override
    public String toString() {
        return "CodigoQR [valor=" + valor + ", usuario=" + usuario3 + "]";
    }
}
