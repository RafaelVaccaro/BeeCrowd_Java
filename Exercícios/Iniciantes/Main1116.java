import java.util.Scanner;

public class Main1116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            Double X = in.nextDouble();
            Double Y = in.nextDouble();

            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n", X/Y);
            }
        }
        in.close();
    }
}
