import java.util.Scanner;

public class Main1101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M;
        int N = 1;
        boolean controle = true;

        while (controle) {
            M = in.nextInt();
            N = in.nextInt();

            int soma = 0;

            if (N > 0 && M > 0) {
                if (M < N) {
                    for (int i = M; i <= N; i++) {
                        System.out.printf("%d ", i);
                        soma += i;
                    }
                } else if (M > N) {
                    for (int i = N; i <= M; i++) {
                        System.out.printf("%d ", i);
                        soma += i;
                    }
                }
                System.out.printf("Sum=%d\n", soma);
            } else {
                controle = false;
            }
        }
        in.close();
    }
}
