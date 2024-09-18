import java.util.Scanner;

public class Main1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double MEDIA = (A * 3.5 + B * 7.5) / 11.0;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        in.close();
    }
}
