import java.util.Scanner;

public class Main1175 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = in.nextInt();
        }

        inverter(arr);

        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, arr[i]);
        }
    }

    public static void inverter(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }
}