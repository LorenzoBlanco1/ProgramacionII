
package com.mycompany.kata4;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String nombre;
    public Animal(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void hacerSonido() {
        System.out.println(this.nombre + " hace un sonido generico.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Guau Guau");
    }
}

class Gato extends Animal {
    public Gato(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Miau");
    }
}

class Vaca extends Animal {
    public Vaca(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Muuu");
    }
}

public class Kata4 {
    public static void main(String[] args) {
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Enock"));
        granja.add(new Gato("Garfield"));
        granja.add(new Vaca("lola"));
        granja.add(new Animal("Tarantula"));

        System.out.println("Sonidos de la granja: ");
        for (Animal a : granja) {
            a.hacerSonido();
        }
    }
}