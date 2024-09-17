import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();
        
        double consumo = distancia / combustivelGasto;
        System.out.printf("%.3f km/l%n", consumo);
        
        scanner.close();
    }
}
