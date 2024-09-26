import java.util.Scanner;

public class Main1145 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();
        int count = 0;
        for (int i = 1; i <= Y; i++) {
            if (count < X-1) {
                System.out.printf("%d ", i);
            } else if (count == X-1) {
                System.out.printf("%d", i);
            }
            count++;
            if (count == X) {
                System.out.println();
                count = 0;
            }
        }

        in.close();
    }
}

