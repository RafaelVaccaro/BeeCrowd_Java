import java.util.Scanner;


public class Main1176 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println("Fib(" + n + ") = " + fib(n));
        }

        in.close();
    }

    private static String fib(int n) {
        long a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return String.valueOf(a);
    }
}
