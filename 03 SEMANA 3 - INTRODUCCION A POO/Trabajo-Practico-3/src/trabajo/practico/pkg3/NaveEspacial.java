
package trabajo.practico.pkg3;
public class NaveEspacial {
    private String nombre;
    private int combustible;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    void despegar() {
        System.out.println("La nave espacial esta despegando...");
    }
    void avanzar(double distancia) {
        if (combustible > 50) {
            System.out.println("Avanzando...");
        } else { 
            System.out.println("La cantidad de combustible no es sufuciente para avanzar. ");
        }
    } 
    void recargarCombustible(double recarga) {
        if ((combustible + recarga) < 50) {
            System.out.println("La recarga no es posible, es menor al minimo del tanque. ");
        } else if ((combustible + recarga) > 1000){
            System.out.println("La carga no es posible, excede la capacidad del tanque. ");
        } else {
            combustible += recarga;
            System.out.println("Combustible cargado correctamente...");
        }
    }
    void mostrarEstado() {
        System.out.println("Nave: " + nombre + "\nCombustible: " + combustible);
    }
}
