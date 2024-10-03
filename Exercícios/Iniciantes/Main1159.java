import java.util.Scanner;

public class Main1159 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        while (true) {
            int X = in.nextInt();
            if (X == 0) {
                break;
            }
            int soma = 0;
            int j = X;
            int ctrl = 0;
            while (ctrl < 5) {
                if (j % 2 == 0) {
                    soma += j;
                    ctrl++;
                }
                j++;
            }
                System.out.println(soma);
        }
    }
}