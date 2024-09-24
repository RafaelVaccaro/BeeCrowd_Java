import java.util.Scanner;

public class Main1114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ctrl = true;

        while (ctrl) {
            int senha = in.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                ctrl = false;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        in.close();
    }
}
