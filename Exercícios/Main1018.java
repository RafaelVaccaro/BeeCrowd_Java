import java.util.Scanner;

public class Main1018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        System.out.println(valor);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int quantidade = valor / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            valor %= nota;
        }

        in.close();
    }
}
