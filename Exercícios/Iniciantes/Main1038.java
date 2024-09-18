import java.util.Scanner;

public class Main1038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // dados
        int codigo = in.nextInt();
        int quantidade = in.nextInt();

        // processamento
        if (codigo == 1) {
            System.out.printf("Total: R$ " + "%.2f", quantidade * 4.00);
            System.out.println();
        } else if (codigo == 2) {
            System.out.printf("Total: R$ " + "%.2f", quantidade * 4.50);
            System.out.println();
        } else if (codigo == 3) {
            System.out.printf("Total: R$ " + "%.2f", quantidade * 5.00);
            System.out.println();
        } else if (codigo == 4) {
            System.out.printf("Total: R$ " + "%.2f", quantidade * 2.00);
            System.out.println();
        } else if (codigo == 5) {
            System.out.printf("Total: R$ " + "%.2f", quantidade * 1.50);
            System.out.println();
        }
        in.close();
    }
}