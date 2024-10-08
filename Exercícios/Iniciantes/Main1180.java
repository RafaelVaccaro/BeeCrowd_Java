import java.util.Scanner;

public class Main1180 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] x = new int[n];
        int min = 0;

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            if (x[i] < x[min]) {
                min = i;
            }
        }

        System.out.println("Menor valor: " + x[min]);
        System.out.println("Posicao: " + min);

        in.close();
    }
}
