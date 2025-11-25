
package com.mycompany.producto.inventario;

public class ProductoInventario {

    public static void main(String[] args) {

        Inventario miInventario = new Inventario();

        // Crear productos y agregarlos.
        System.out.println();
        miInventario.agregarProducto(new Producto("1", "mouse", 5000.0, 1, CategoriaProducto.ELECTRONICA));
        miInventario.agregarProducto(new Producto("2", "camisa", 10000.00, 1, CategoriaProducto.ROPA));
        miInventario.agregarProducto(new Producto("3", "Vacio", 1500.00, 100, CategoriaProducto.ALIMENTOS));
        miInventario.agregarProducto(new Producto("4", "Lampara", 300.00, 1, CategoriaProducto.HOGAR));
        miInventario.agregarProducto(new Producto("5", "Camara", 20000.00, 1, CategoriaProducto.ELECTRONICA));

        // Mostrar productos.
        System.out.println("Productos: ");
        miInventario.listarProductos();

        // Buscar producto.
        System.out.println("Buscar Producto: ");
        miInventario.buscarProductoPorId("2");

        // Filtrar por categoria.
        System.out.println("Filtrar por categoria: ");
        miInventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // Eliminar producto y mostrar lista actualzada. 
        System.out.println("Eliminar producto: ");
        miInventario.eliminarProducto("3");
        System.out.println("Mostrar lista actualizada: ");
        miInventario.listarProductos();

        // Actualizar Stock.
        System.out.println("Actualizar Stock: ");
        miInventario.actualizarStock("2", 2);

        // Mostrar stock total.
        System.out.println("Mostrar Stock total: ");
        miInventario.obtenerTotalStock();

        // Producto con mayor Stock.
        System.out.println("Producto con mayor stock: ");
        miInventario.obtenerProductoConMayorStock();

        // Filtrar productos por precio. 
        System.out.println("Productos cuyo precio esta entre $1000.00 y $3000.00: ");
        miInventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        // Categorias disponibles.
        System.out.println("Categorias disponibles: ");
        miInventario.mostrarCategoriasDisponibles();
    }
}