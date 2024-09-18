import java.util.Scanner;

public class Main1043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
        
        in.close();
    }
}
