import java.util.Scanner;

public class Main1115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean ctrl = true;

        while (ctrl) {
            int X = in.nextInt();
            int Y = in.nextInt();

            if (X>0 && Y>0) {
                System.out.println("primeiro");
            } else if (X<0 && Y>0) {
                System.out.println("segundo");
            } else if (X<0 && Y<0) {
                System.out.println("terceiro");
            } else if (X>0 && Y<0) {
                System.out.println("quarto");
            } else if (X == 0 || Y == 0) {
                ctrl = false;
            }
        }
        in.close();
    }
}
