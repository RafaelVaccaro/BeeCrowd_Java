import java.util.Scanner;

public class Main1150 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Z;
        int nSomas = 1;
        int soma = X;
        int i = 1;

        while (true) {
            Z = in.nextInt();
            if (Z > X) {
                break;
            }
        }

        while (soma < Z) {
            soma += X + i;
            i++;
            nSomas++;
        }

        System.out.println(nSomas);
    }
}
