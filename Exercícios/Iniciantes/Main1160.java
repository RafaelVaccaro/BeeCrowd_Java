import java.util.Scanner;

public class Main1160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = in.nextInt();
            int PB = in.nextInt();
            float G1 = in.nextFloat();
            float G2 = in.nextFloat();
            int anos = 0;

            while (PA <= PB) {
                PA += PA * G1 / 100;
                PB += PB * G2 / 100;
                anos++;

                if (anos > 100) {
                    break;
                }
            }

            if (anos <= 100) {
                System.out.printf("%d anos.\n", anos);
            } else {
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}
