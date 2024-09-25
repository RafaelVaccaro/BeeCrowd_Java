import java.util.Scanner;

public class Main1134 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean ctrl = true;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (ctrl) {
            int cod = in.nextInt();
            if (cod == 1) {
                alcool++;
            } else if (cod == 2) {
                gasolina++;
            } else if (cod == 3) {
                diesel++;
            } else if (cod == 4) {
                ctrl = false;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
        in.close();
    }
}
