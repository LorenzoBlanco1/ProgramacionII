
package com.mycompany.universidadprofesor;

public class UniversidadProfesor {
    public static void main(String[] args) {

        // Crear Universidad.
        Universidad universidad = new Universidad("UTN - CBA");

        // Crear entidades.
        System.out.println("Creando entidades (profesores y cursos: )");
        Profesor profesor1 = new Profesor("1", "Javier Blanco", "Algoritmos y Estructura de Datos");
        Profesor profesor2 = new Profesor("2", "Irene Ortin", "Quimica");
        Profesor profesor3 = new Profesor("3", "Rodrigo Luna", "Analisis Matematico");

        Curso curso1 = new Curso("1", "Ingles I");
        Curso curso2 = new Curso("2", "Bases de Datos I");
        Curso curso3 = new Curso("3", "Programacion II");
        Curso curso4 = new Curso("4", "Arquitectura de Compoutadoras");
        Curso curso5 = new Curso("5", "Probabilidad y Estadistica");

        // Agregar entidades a la Universidad.
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // Asignar profesores a cursos.
        System.out.println("Asignar profesores a los cursos");
        universidad.asignarProfesorACurso("1", "1"); 
        universidad.asignarProfesorACurso("2", "2");
        universidad.asignarProfesorACurso("3", "3");
        universidad.asignarProfesorACurso("4", "4"); 

        // Mostrar Profesores y Cursos.
        System.out.println("Listado profesores y alumnos: ");
        universidad.listarCursos();
        universidad.listarProfesores();

        // Cambiar profesor de curso. 
        System.out.println("Reasignando profesor a curso: ");
        universidad.asignarProfesorACurso("1", "3");
        System.out.println("Verificando Sincronización...");
        System.out.println("Actualizando cantidad de cursos de los profesores...");
        universidad.buscarProfesorPorId("1").listarCursos();
        System.out.println("Cantidad de cursos del profesor...");
        universidad.buscarProfesorPorId("3").listarCursos();
        System.out.println("Sincronizando actualizacion de profesor a curso...");
        universidad.buscarCursoPorCodigo("3").mostrarInfo();


        // Remover un curso.
        System.out.println("Eliminar curso: ");
        universidad.eliminarCurso("2");

        System.out.println("Sincronizando...");
        System.out.println("Verificar cambios realizados correctamente: ");
        universidad.buscarProfesorPorId("2").listarCursos();


        // Remover un profesor
        System.out.println("Eliminar Profesor: ");
        universidad.eliminarProfesor("4");

        System.out.println("Sincronizanco...");
        System.out.println("Verificando cambios realizados correctamente: ");
        universidad.buscarCursoPorCodigo("4").mostrarInfo();


        // Mostrar reporte
        System.out.println("Reporte carga horaria: ");
        universidad.mostrarReporteCargaHoraria();
    }
}