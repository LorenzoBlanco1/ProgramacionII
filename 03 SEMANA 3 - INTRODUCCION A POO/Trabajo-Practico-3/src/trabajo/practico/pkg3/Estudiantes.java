
package trabajo.practico.pkg3;


public class Estudiantes {
    String nombre; 
    String apellido; 
    String curso; 
    double calificacion; 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    void mostrarInfo() {
            System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);  
    }
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    } 
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}
