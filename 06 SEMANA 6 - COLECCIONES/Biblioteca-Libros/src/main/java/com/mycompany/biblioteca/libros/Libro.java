
package com.mycompany.biblioteca.libros;
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Asociación simple con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void mostrar() {
        System.out.println("Libro");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Anio: " + this.anioPublicacion);
        // Accede al autor para mostrar su nombre
        System.out.println("Autor: " + this.autor.getNombre());
    }

    
}