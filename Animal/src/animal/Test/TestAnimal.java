package animal.Test;

import animal.Animal;
import animal.Araña;
import animal.Gato;
import animal.Pez;

public class TestAnimal {

    public static void main(String[] args) {

        Araña araña = new Araña();
        Gato gato = new Gato();
        Pez pez = new Pez();

        araña.comer();
        gato.comer();
        pez.comer();
        
        araña.jugar();
        gato.jugar();
        pez.jugar();

    }

    public static void muestraQueCome(Animal a) {
        a.comer();//llamo el metodo abstracto comer de la clase Animal

    }
}
//asdasdasdd