import java.util.Scanner;

public class Main1099 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int soma = 0;
            if (X < Y) {
                for (int j = X+1; j < Y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else if (X>Y) {
                for (int j = X-1; j > Y; j--) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
        in.close();
    }
}
