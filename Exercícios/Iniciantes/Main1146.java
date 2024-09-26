import java.util.Scanner;

public class Main1146 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ctrl = true;
        int cont = 1;

        while (ctrl) {
            int valor = in.nextInt();

            if (valor == 0) {
                ctrl = false;
            } else {
                for (int i = 1; i <= valor; i++) {
                    if (cont < valor) {
                        System.out.printf("%d ", i);
                    } else if (cont == valor) {
                        System.out.printf("%d\n", i);
                    }
                    cont++;
                }
            }
            cont = 1;
        }
    }
}
