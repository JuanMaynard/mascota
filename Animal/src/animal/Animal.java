package animal;

import Interface.EmisorSonido;
import Interface.Mascota;

public abstract class Animal implements Mascota, Comparable, EmisorSonido {

    public int peso;
    public String sonido;
    public String nombre;

    public void setNombre(String nombre) {
        this.nombre = this.nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return this.sonido;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return this.peso;
    }

    public Animal() {
    }

    public Animal(int patas) {
    }

    public abstract void comer();

    @Override
    public abstract void emitirSonido();

    //comparo peso de animal
    public int compareTo(Animal a) {//poner int
        if (this.peso < a.peso) {
            return -1;
        }
        if (this.peso == a.peso) {
            return 0;
        }
        return 1;
    }
}
