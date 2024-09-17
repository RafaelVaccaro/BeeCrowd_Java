import java.util.Scanner;

public class Main1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        int notas = (int) valor;
        int moedas = (int) ((valor - notas) * 100);
        
        int[] notasValores = {100, 50, 20, 10, 5, 2};
        int[] moedasValores = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notasValores) {
            System.out.printf("%d nota(s) de R$ %d.00%n", notas / nota, nota);
            notas %= nota;
        }

        System.out.println("MOEDAS:");
        moedas += notas * 100;
        for (int moeda : moedasValores) {
            System.out.printf("%d moeda(s) de R$ %.2f%n", moedas / moeda, moeda / 100.0);
            moedas %= moeda;
        }

        scanner.close();
    }
}
