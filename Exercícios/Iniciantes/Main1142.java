import java.util.Scanner;

public class Main1142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 0; i < N; i++) {
            System.out.printf("%d %d %d PUM\n", a, b, c);
            a += 4;
            b += 4;
            c += 4;
        }
        in.close();
    }
}
