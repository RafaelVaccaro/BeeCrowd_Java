import java.util.Scanner;

public class Main1079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            
            // Pesos 2, 3 e 5
            double media = (a * 2 + b * 3 + c * 5) / 10.0;
            
            System.out.printf("%.1f\n", media);
        }
        
        in.close();
    }
}
