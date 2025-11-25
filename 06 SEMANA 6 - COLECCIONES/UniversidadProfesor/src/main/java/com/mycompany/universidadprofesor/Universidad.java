
package com.mycompany.universidadprofesor;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);}

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);}

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : this.profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;}
        }
        return null; 
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : this.cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;}
        }
        return null;
    }

    public void listarProfesores() {
        System.out.println("\nProfesores de: " + this.nombre);
        for (Profesor profesor : this.profesores) {
            profesor.mostrarInfo();
            profesor.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos de: " + this.nombre);
        for (Curso cursos : this.cursos) {
            cursos.mostrarInfo();
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        System.out.println("\nProfesor " + idProfesor + " asignado al curso " + codigoCurso);
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); 
        } else {
            System.out.println("No se encuentra curso/profesor");
        }
    }

    public void eliminarCurso(String codigo) {
        System.out.println("\nEliminar curso: " + codigo);
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null);
            this.cursos.remove(curso);
            System.out.println("Se elimino el curso: "+ codigo);
        }
    }

    public void eliminarProfesor(String id) {
        System.out.println("\nEliminar profesor: " + id );
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            this.profesores.remove(profesor);
            System.out.println("Profesor eliminado y cursos desasignados.");}
    }

    public void mostrarReporteCargaHoraria() {
        System.out.println("\nReporte de carga Horaria: ");
        for (Profesor profesor : this.profesores) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos.");}
    }
}
