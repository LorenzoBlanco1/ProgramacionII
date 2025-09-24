
package trabajo.practico.pkg3;

public class Mascotas {
    String nombre;
    String especie;
    int edad; 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
    void cumplirAnios(){
        edad += 1;
    }
}
