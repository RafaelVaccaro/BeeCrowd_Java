import java.util.Scanner;

public class Main1143 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = 0; i < N; i++) {
            System.out.printf("%d %d %d\n", a, b, c);
            a += 1;
            b = (int) Math.pow(a, 2);
            c = (int) Math.pow(a, 3);
        }
        in.close();
    }
}