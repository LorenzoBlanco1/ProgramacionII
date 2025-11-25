
package com.mycompany.sistema.ecomerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente; 
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : this.productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        this.cliente.notificar("Estado de pedido: " + nuevoEstado);
    }
}