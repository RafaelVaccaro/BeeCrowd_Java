import java.util.Scanner;

public class Main1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("%.4f%n", distancia);
        
        scanner.close();
    }
}
