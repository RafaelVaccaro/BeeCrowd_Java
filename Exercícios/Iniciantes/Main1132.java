import java.util.Scanner;

public class Main1132 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int soma = 0;

        if (X < Y) {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        } else if (X > Y) {
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);

        in.close();
    }
}
