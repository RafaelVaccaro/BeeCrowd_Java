import java.util.Scanner;

public class Main1144 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;

        for (int j = 0; j < N; j++) {
            System.out.printf("%d %d %d\n", a, (int) Math.pow(a, 2), (int) Math.pow(a, 3));
            System.out.printf("%d %d %d\n", a, (int) Math.pow(a, 2) + 1, (int) Math.pow(a, 3) + 1);
            a++;

        }
        in.close();
    }
}
