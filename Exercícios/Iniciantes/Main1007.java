import java.util.Scanner;

public class Main1007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        in.close();
    }
}
