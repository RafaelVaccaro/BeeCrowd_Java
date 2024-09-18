import java.util.Scanner;
import java.util.Arrays;

public class Main1045 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double[] lados = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
        Arrays.sort(lados);
        
        double A = lados[2];
        double B = lados[1];
        double C = lados[0];
        
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) System.out.println("TRIANGULO RETANGULO");
            if (A * A > B * B + C * C) System.out.println("TRIANGULO OBTUSANGULO");
            if (A * A < B * B + C * C) System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
            if ((A == B && A != C) || (B == C && B != A) || (A == C && A != B)) System.out.println("TRIANGULO ISOSCELES");
        }
        
        in.close();
    }
}
