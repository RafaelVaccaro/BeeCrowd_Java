import java.util.Scanner;

public class Main1177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + i % t);
        }

        in.close();
    }
}
