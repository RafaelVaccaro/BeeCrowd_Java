import java.util.Scanner;

public class Main1113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean ctrl = true;

        while (ctrl) {
            int X = in.nextInt();
            int Y = in.nextInt();

            if (X == Y) {
                ctrl = false;
            } else {
                if (X < Y) {
                    System.out.println("Crescente");
                } else if (X > Y) {
                    System.out.println("Decrescente");
                }
            }
        }


        in.close();
    }
}
