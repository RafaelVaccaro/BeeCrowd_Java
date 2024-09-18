import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia = in.nextInt();
        double combustivelGasto = in.nextDouble();
        
        double consumo = distancia / combustivelGasto;
        System.out.printf("%.3f km/l%n", consumo);
        
        in.close();
    }
}
