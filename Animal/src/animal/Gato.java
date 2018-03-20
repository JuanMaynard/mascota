package animal;

import Interface.Mascota;

public class Gato extends AnimalConPatas implements Mascota {

    public String nombre;
    public String sonido;

    public Gato() {
        super(4);
        this.nombre = nombre;
        this.sonido = sonido;
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
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String getSonido() {
        return this.sonido;
    }

    @Override
    public void comer() {
        System.out.println("el gato come laucha");
    }

    @Override
    public void jugar() {
        System.out.println("el gato esta jugando");
    }

    @Override
    public void emitirSonido() {
        System.out.println("miau");
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
