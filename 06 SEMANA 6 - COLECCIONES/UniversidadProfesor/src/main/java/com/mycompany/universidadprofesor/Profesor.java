
package com.mycompany.universidadprofesor;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c) {
        c.setProfesor(this);}

    public void eliminarCurso(Curso c) {
        if (this.cursos.contains(c)) {
            c.setProfesor(null);}
    }

    void _internalAddCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);}
    }

    void _internalRemoveCurso(Curso c) {
        this.cursos.remove(c);
    }

    public void listarCursos() {
        System.out.println(this.nombre + " dicta los cursos: :");
        if (this.cursos.isEmpty()) {
            System.out.println("    (ninguno)");
            return;
        }
        for (Curso c : this.cursos) {
            System.out.println("    - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Total de Cursos: " + this.cursos.size());
    }

    
    
}
