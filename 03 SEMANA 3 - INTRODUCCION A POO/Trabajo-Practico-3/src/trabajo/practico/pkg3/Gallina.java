 
package trabajo.practico.pkg3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    public int getIdGallina() {
        return idGallina;
    }
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    void ponerHuevos(int huevos) {
        huevosPuestos += huevos; 
    }
    void envejecer(int anios) {
        if (anios > 0) {
            edad += anios;
        }
    }
    void mostrarEstado() {
        System.out.println("Gallina " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos);
    }
}
