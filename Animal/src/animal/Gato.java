package animal;

import Interface.Mascota;

public class Gato extends AnimalConPatas implements Mascota {

    public String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Gato() {
        super(4);
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("el gato come laucha");
    }

    @Override
    public void jugar() {
        System.out.println("el gato esta jugando");
    }
}
