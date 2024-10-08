import java.util.Scanner;

public class Main1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        char t = in.next().charAt(0);
        double[][] m = new double[12][12];
        double s = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = in.nextDouble();
                if (i == l) {
                    s += m[i][j];
                }
            }
        }

        if (t == 'M') {
            s /= 12;
        }

        System.out.printf("%.1f\n", s);

        in.close();
    }
}
