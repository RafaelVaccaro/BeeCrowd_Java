import java.util.Scanner;

public class Main1173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        int inicio = in.nextInt();
        arr[0] = inicio;

        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i-1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("N[%d] = %d\n", i, arr[i]);
        }
    }
}
