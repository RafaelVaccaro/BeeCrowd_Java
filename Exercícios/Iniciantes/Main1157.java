import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                System.out.println(i);
            }
        }
    }
}