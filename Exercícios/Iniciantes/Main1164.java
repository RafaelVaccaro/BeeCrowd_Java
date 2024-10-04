import java.util.Scanner;

public class Main1164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            int soma = 0;

            for (int j = 1; j < X; j++) {
                if (X%j == 0) {
                    soma += j;
                }
            }
            if (soma == X) {
                System.out.printf("%d eh perfeito\n", X);
            } else {
                System.out.printf("%d nao eh perfeito\n", X);
            }
        }
    }
}
