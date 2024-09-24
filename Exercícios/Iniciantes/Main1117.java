import java.util.Scanner;

public class Main1117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notaInv = 0;
        double soma = 0.0;

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

        in.close();
    }
}
