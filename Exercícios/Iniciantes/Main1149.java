import java.util.Scanner;

public class Main1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int N;
        int soma = 0;

        while (true) {
            N = in.nextInt();
            if (N > 0) {
                break;
            }
        }

        for (int i = 0; i <= N-1; i++) {
            soma += A + i;
        }

        System.out.println(soma);
    }
}
