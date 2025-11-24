package com.mycompany.tp5;
public class Libro {
    
    private String titulo; 
    private String isbn;
    private Autor autor;
    private Editorial editorial; 
    
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null){
        this.titulo = titulo;}
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null){
        this.isbn = isbn;}
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor(Autor autor){
        if (autor != null){
            this.autor = autor;
        } else {System.out.println("El libro no tiene autor.");}
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", "
                + "editorial" + editorial + '}';
    }
    
}
