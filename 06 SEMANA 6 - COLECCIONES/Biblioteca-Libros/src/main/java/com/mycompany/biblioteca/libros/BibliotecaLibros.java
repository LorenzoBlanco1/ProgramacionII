
package com.mycompany.biblioteca.libros;

public class BibliotecaLibros {
    public static void main(String[] args) {

        // Crear Bibliotea.
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca1");

        // Crear 3 Autores.
        System.out.println("Crear Autores...");
        Autor autor1 = new Autor("Autor 1", "Lorenzo", "Argentino");
        Autor autor2 = new Autor("Autor 2", "Belen", "Argentina");
        Autor autor3 = new Autor("Autor 3", "Javier", "Argentino");

        // Agregar 5 Libros.
        System.out.println("Agregar Libros...");
        miBiblioteca.agregarLibro("000-0000000000", "Libro 0", 2004, autor1);
        miBiblioteca.agregarLibro("111-1111111111", "Libro 1", 2006, autor3);
        miBiblioteca.agregarLibro("222-2222222222", "Libro 2", 2008, autor2);
        miBiblioteca.agregarLibro("333-3333333333", "Libro 3", 2010, autor1);
        miBiblioteca.agregarLibro("444-4444444444", "Libro 4", 2012, autor3);

        // Mostrar libros.
        System.out.println("Libros: ");
        miBiblioteca.listarLibros();

        // Buscar libro.
        System.out.println("Buscar Libro: ");
        miBiblioteca.buscarLibro("000-0000000000");

        // Filtrar por anio.
        System.out.println("Mostrar Libros anio especifico...");
        miBiblioteca.filtrarLibrosPorAnio(2006);

        // Eliminar libro.
        System.out.println("Eliminar libro por ISBN...");
        miBiblioteca.eliminarLibro("444-4444444444"); 
        System.out.println("Lista Libros actualizada: ");
        miBiblioteca.listarLibros();

        // Mostrar libros.
        System.out.println("Cantidad de libros: ");
        miBiblioteca.obtenerCantidadLibros();

        // Mostrar autores.
        System.out.println("Mostrar autores...");
        miBiblioteca.mostrarAutoresDisponibles();
    }
}
