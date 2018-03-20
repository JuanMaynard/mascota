package animal;

public class Araña extends AnimalConPatas {

    public String sonido;

    public Araña() {
        super(8);
        this.sonido = sonido;
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
        System.out.println("la araña come mosca");
    }

    @Override
    public void jugar() {
        System.out.println("la araña esta jugando");
    }

    @Override
    public void emitirSonido() {
        System.out.println("la araña hace ruido");
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
