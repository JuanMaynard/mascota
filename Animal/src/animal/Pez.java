package animal;

import Interface.Mascota;

public class Pez extends Animal implements Mascota {

    public String nombre;

    public Pez() {
        this.nombre = nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void comer() {
        System.out.println("el pez come carnada");
    }

    @Override
    public void jugar() {
        System.out.println("el pez esta jugando");
    }

    @Override
    public void emitirSonido() {
        System.out.println("el pez hace ruido");
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
