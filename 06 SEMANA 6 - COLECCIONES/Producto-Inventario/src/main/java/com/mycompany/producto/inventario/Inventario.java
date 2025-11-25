
package com.mycompany.producto.inventario;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;
    public Inventario() {
        this.productos = new ArrayList<>();}
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Se agrega el Producto '" + p.getNombre());}
    public void listarProductos() {
        System.out.println("\nListado:  (" + productos.size() + ")");
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;}
        for (Producto producto : this.productos) {
            producto.mostrar();}
    }

    private Producto buscar(String id) {
        for (Producto producto : this.productos) {
            if (producto.getId().equals(id)) {
                return producto; // 
            }}
        return null;}

    public Producto buscarProductoPorId(String id) {
        Producto producto = buscar(id);
        if (producto != null) {
            System.out.println("\nSe encontro el Producto: " + id);
            producto.mostrar();
        } else {
            System.out.println("\nNo se encontro el Producto con ID:" + id);}
        return producto;
    }

    public void eliminarProducto(String id) {
        Producto producto = buscar(id);
        if (producto != null) {
            this.productos.remove(producto);
            System.out.println("\nSe elimino el Producto " + producto.getNombre());
        } else {
            System.out.println("\nNo existe el Producto " + id);}
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscar(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("\nStock de '" + producto.getNombre() + "' actualizado a " + nuevaCantidad);
        } else {
            System.out.println("\nNo existe el Producto " + id);}
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\nProductos de la categoria: " + categoria);
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getCategoria() == categoria) {
                filtrados.add(producto);
                producto.mostrar();}
        }
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron productos en esta categoria.");}
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : this.productos) {
            total += producto.getCantidad();}
        System.out.println("\nStock total: " + total);
        return total;}

    public Producto obtenerProductoConMayorStock() {
        Producto maxProducto = null;
        if (productos.isEmpty()) {
            System.out.println("\nNo hay productos.");
            return null;}
        for (Producto producto : this.productos) {
            if (maxProducto == null || producto.getCantidad() > maxProducto.getCantidad()) {
                maxProducto = producto;
            }
        }
        System.out.println("Producto con mayor stock: ");
        maxProducto.mostrar();
        return maxProducto;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\nProductos entre $" + min + " y $" + max);
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
                p.mostrar();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("No existen productos con precios entre $"+min+" y $"+ max);
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\nCategorias Disponibles:");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
}
