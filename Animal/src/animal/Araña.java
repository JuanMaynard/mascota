package animal;

public class Araña extends AnimalConPatas {

    public Araña() {
        super(8);
    }

    @Override
    public void comer() {
        System.out.println("la araña come mosca");
    }

    @Override
    public void jugar() {
        System.out.println("la araña esta jugando");
    }
}
