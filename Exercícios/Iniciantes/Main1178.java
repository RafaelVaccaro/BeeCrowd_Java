import java.util.Scanner;

public class Main1178 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f\n", i, x);
            x /= 2;
        }

        in.close();
    }
}
