import java.util.Scanner;

public class Main1158 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int soma = 0;
            int j = X;
            int ctrl = 0;
            while (ctrl < Y) {
                if (j % 2 != 0) {
                    soma += j;
                    ctrl++;
                }
                j++;
            }
                System.out.println(soma);
        }
    }
}