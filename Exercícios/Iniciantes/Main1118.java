import java.util.Scanner;

public class Main1118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notaInv = 0;
        double soma = 0.0;
        boolean ctrl = true;
        int nc = 0;
        while (ctrl) {

            while (notaInv < 2) {
                double nota = in.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    notaInv++;
                } else {
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f\n", soma / 2.0);

            while (nc != 1 && nc != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                nc = in.nextInt();
                if (nc == 2) {
                    ctrl = false;
                }
            }
            notaInv = 0;
            soma = 0.0;
            nc = 0;
        }

        in.close();
    }
}
