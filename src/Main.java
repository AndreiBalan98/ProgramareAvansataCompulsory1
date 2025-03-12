import utils.Mesaje;
import utils.Operatii;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"Java", "C#", "Python", "PHP"};

        for (int i = 0; i < languages.length; i++) {
            System.out.print((int) (Math.random() * 10_000) + " ");
        }
        System.out.println();

        int n = (int) (Math.random() * 10_000);
        n += 0b10101;
        System.out.println(n);

        n += 0xFF;
        System.out.println(n);

        int aux = 0;
        while (n > 9) {
            aux = 0;
            while (n != 0){
                aux +=  n % 10;
                n = n / 10;
            }
            n = aux;
        }
        System.out.println(n);
        System.out.println();

        System.out.println(Operatii.sum(aux, n));
        Mesaje.message();
    }
}
