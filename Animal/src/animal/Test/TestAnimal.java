package animal.Test;

import Interface.EmisorSonido;
import Interface.Mascota;
import animal.Animal;
import animal.Araña;
import animal.Gato;
import animal.Perro;
import animal.Pez;

public class TestAnimal {

    public static void muestraQueCome(Animal a) {
        a.comer();//llamo el metodo abstracto comer de la clase Animal
    }

    public static void jugarConMiMascota(Mascota m) {
        m.jugar();
    }
    
    public static void emitirSonido(){//faltaria completar aca
    
    }

    public static void main(String[] args) {

        Araña araña = new Araña();
        Gato gato = new Gato();
        Pez pez = new Pez();

        muestraQueCome(araña);
        muestraQueCome(gato);
        muestraQueCome(pez);

        pez.setNombre("nemo");
        gato.setNombre("tiana");

        araña.setPatas(8);
        gato.setPatas(4);

        //ej 5
        Mascota[] m = new Mascota[4];
        m[0] = new Pez();
        m[1] = new Pez();
        m[2] = new Gato();
        m[3] = new Gato();

        for (int i = 0; i < m.length; i++) {
            Mascota mascota = m[i];//nombre mascota
            mascota.jugar();
        }

        //ej 6 arreglar aca
        EmisorSonido[] s = new EmisorSonido[5];
        s[0] = new Perro();
        s[1] = new Perro();
        s[2] = new Gato();
        s[3] = new Gato();
        s[4] = new Gato();

        for (int i = 0; i < s.length; i++) {
          s[i]=emitirSonido();
        }
    }
}
