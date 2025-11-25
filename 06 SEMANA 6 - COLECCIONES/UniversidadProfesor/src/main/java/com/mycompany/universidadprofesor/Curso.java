
package com.mycompany.universidadprofesor;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        Profesor profesorViejo = this.profesor;
        if (profesorViejo == profesor) {
            return;}
        if (profesorViejo != null) {
            profesorViejo._internalRemoveCurso(this);}
        this.profesor = profesor;
        if (profesor != null) {
            profesor._internalAddCurso(this);}
    }

    public void mostrarInfo() {
        System.out.println("Curso");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);

        String nombreProfesor = (this.profesor != null) ? this.profesor.getNombre() : "Sin asignar";
        System.out.println("Profesor: " + nombreProfesor);}

    
}
