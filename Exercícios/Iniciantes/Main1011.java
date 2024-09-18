import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio = in.nextDouble();
        double volume = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
        in.close();
    }
}
