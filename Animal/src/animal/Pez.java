package animal;

import Interface.Mascota;

public class Pez extends Animal implements Mascota {

    public String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Pez() {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("el pez come carnada");
    }

    @Override
    public void jugar() {
        System.out.println("el pez esta jugando");
    }
}
