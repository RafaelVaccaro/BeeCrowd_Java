import java.util.Scanner;

public class Main1179 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int parIndex = 0;
        int imparIndex = 0;

        for (int i = 0; i < 15; i++) {
            int n = in.nextInt();

            if (n % 2 == 0) {
                par[parIndex++] = n;
            } else {
                impar[imparIndex++] = n;
            }

            if (parIndex == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
                parIndex = 0;
            }

            if (imparIndex == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
                imparIndex = 0;
            }

            if (i == 14) {
                for (int j = 0; j < imparIndex; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
                for (int j = 0; j < parIndex; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
            }
        }
        in.close();
    }
}
