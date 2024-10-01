import java.util.Scanner;

public class Main1151 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int a = 0, b = 1;
        System.out.print(a);

        for (int i = 1; i < N; i++) {
            System.out.print(" " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
