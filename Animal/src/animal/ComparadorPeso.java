package animal;

public class ComparadorPeso {

    public void verificarPeso(Animal a, Animal b) {

        if (a.compareTo(b) == -1) {
            System.out.println("el primero es mas liviano");
        }
        if (a.compareTo(b) == 0) {
            System.out.println("pesan lo mismo");
        } else {
            System.out.println("el primero es mas pesado");
        }
    }
}
