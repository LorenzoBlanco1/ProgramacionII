
package trabajo.practico.pkg3;


public class TrabajoPractico3 {

    
    public static void main(String[] args) {
        // Crear un objeto de clase estudiante.
        Estudiantes estudiante1 = new Estudiantes();
        
        // Instanciar un objeto de clase estudiante.
        estudiante1.setNombre("Lorenzo");
        estudiante1.setApellido("Blanco");
        estudiante1.setCurso("1 A");
        estudiante1.setCalificacion(9);
        estudiante1.mostrarInfo(); 
        
        // Subir calificacion utilizando el metodo subirCalificacion(puntos)
        estudiante1.subirCalificacion(1);
        System.out.println("La calificacion de " + estudiante1.nombre + " es " + estudiante1.calificacion);
        
        // Bajar calificacion utilizando el metodo bajarCalificacion(puntos)
        estudiante1.bajarCalificacion(1);
        System.out.println("La calificacion de " + estudiante1.nombre + " es " + estudiante1.calificacion);
        
        
        // Crear un objeto de la clase Mascotas.
        Mascotas mascota1 = new Mascotas();
        
        // Instaciar un objeto de la clase Mascotas. 
        mascota1.setNombre("Enock");
        mascota1.setEspecie("Maltes");
        mascota1.setEdad(11);
        
        // Mostrar informacion.
        mascota1.mostrarInfo();
        // Simular el paso del tiempo.
        mascota1.cumplirAnios();
        // Mostrar edad actualizada. 
        mascota1.mostrarInfo();
        
        // Crear un objeto de la clase Libro.
        Libro libro1 = new Libro();
        
        // Instanciar un objeto de la clase Libro.
        libro1.setTitulo("El hombre mas rico de babilonia.");
        libro1.setAutor("George Samuel Clason");
        libro1.setAnioPublicacion(3000);
        // Mostrar informacion con anio valido.
        libro1.setAnioPublicacion(1926);
        libro1.mostrarInfo();
        
        // Crear dos objeto de clase Gallina.
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        // Instanciamos los objetos de la clase Gallina. 
        gallina1.setIdGallina(1);
        gallina1.setEdad(10);
        gallina1.setHuevosPuestos(100);
        gallina1.mostrarEstado();
        
        gallina2.setIdGallina(2);
        gallina2.setEdad(5);
        gallina2.setHuevosPuestos(50);
        gallina2.mostrarEstado();
        
        // Utilizamos los metodos de la clase Gallina. 
        gallina1.ponerHuevos(10);
        gallina1.envejecer(1);
        gallina1.mostrarEstado();
        
        
        gallina2.ponerHuevos(10);
        gallina2.envejecer(1);
        gallina2.mostrarEstado();
        
        
        
        // Crear un objeto de clase NaveEspacial. 
        NaveEspacial nave1 = new NaveEspacial();
        // Instanciamos un objeto de la clase NaveEspacial. 
        nave1.setNombre("Apolo XV");
        nave1.setCombustible(50);
        nave1.mostrarEstado();
        
        nave1.despegar();
        nave1.avanzar(100);
        
        nave1.recargarCombustible(100);
        
        nave1.mostrarEstado();
        nave1.avanzar(100);
        nave1.mostrarEstado();
        
        
    }
    
}
