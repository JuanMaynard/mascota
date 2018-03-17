package animal;

public abstract class AnimalConPatas extends Animal {

    private int patas;

    public AnimalConPatas(int patas) {
        this.patas = patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return this.patas;
    }
}
