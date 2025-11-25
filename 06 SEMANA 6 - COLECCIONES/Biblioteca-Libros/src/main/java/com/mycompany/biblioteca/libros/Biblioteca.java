
package com.mycompany.biblioteca.libros;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Se agrego a la biblioteca el libro: " + titulo);
    }

    public void listarLibros() {
        System.out.println("\nLibros: " + this.nombre);
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrar();
        }
    }

    private Libro buscar(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro; 
            }
        }
        return null;
    }

    public Libro buscarLibro(String isbn) {
        System.out.println("\nBuscar libro por ISBN: " + isbn );
        Libro libro = buscar(isbn);
        if (libro != null) {
            libro.mostrar();
        } else {
            System.out.println("\nNo se encontro un libro con ISBN: " + isbn);
        }
        return libro;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscar(isbn);
        if (libro != null) {
            this.libros.remove(libro);
            System.out.println("\nSe elimino el libro: " + libro.getTitulo());
        } else {
            System.out.println("\nNo existe un libro con ISBN: " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        int cantidad = this.libros.size();
        System.out.println("\nLa cantidad de libros es: " + cantidad);
        return cantidad;
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\nLibros que se publicaron en el anio: " + anio);
        int contador = 0;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrar();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay libros publicados en el anio: "+ anio);
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\nAutores Disponibles:");
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : this.libros) {
            autoresUnicos.add(libro.getAutor());}
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores unicos.");
            return;}
        for (Autor autor : autoresUnicos) {
            autor.mostrar();}
    }
}
