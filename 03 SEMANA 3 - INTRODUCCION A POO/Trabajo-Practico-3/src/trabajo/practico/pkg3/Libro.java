
package trabajo.practico.pkg3;


public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion; 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("El anio ingresado es invalido. ");
        }
    }
    
    
    void mostrarInfo() {
        System.out.println("Libro: " + titulo + "\nAutor: " + autor + "\nAnio Publicacion: " + anioPublicacion);
    }
    
    
    
}
