package animal;

import java.util.Scanner;

public class TestComparadorPeso {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        Gato a = new Gato();
        Gato b = new Gato();
        
        //peso de los 2 gatos
        a.setPeso(4);
        b.setPeso(3);
        
        //llamo a compararPeso que tiene el metodo verificarPeso
        ComparadorPeso cp = new ComparadorPeso();
        cp.verificarPeso(a, b);
        
    }
}
