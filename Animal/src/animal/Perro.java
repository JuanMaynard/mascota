package animal;

import Interface.EmisorSonido;
import Interface.Mascota;

public class Perro extends Animal implements Mascota, EmisorSonido {

    public String sonido;

    public Perro() {
        this.sonido = "guau";
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
        System.out.println("perro come carne");
    }

    @Override
    public void emitirSonido() {
        System.out.println(this.sonido);
    }

    @Override
    public void jugar() {
        System.out.println("el perro juega");
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
