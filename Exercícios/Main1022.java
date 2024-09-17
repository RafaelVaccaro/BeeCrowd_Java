import java.util.Scanner;

public class Main1022 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            String lixo1 = scanner.next();
            int d1 = scanner.nextInt();
            String operador = scanner.next();
            int n2 = scanner.nextInt();
            String lixo2 = scanner.next();
            int d2 = scanner.nextInt();
            
            int num = 0, den = 0;
            
            switch (operador) {
                case "+":
                    num = n1 * d2 + n2 * d1;
                    den = d1 * d2;
                    break;
                case "-":
                    num = n1 * d2 - n2 * d1;
                    den = d1 * d2;
                    break;
                case "*":
                    num = n1 * n2;
                    den = d1 * d2;
                    break;
                case "/":
                    num = n1 * d2;
                    den = n2 * d1;
                    break;
            }
            
            int gcd = gcd(Math.abs(num), Math.abs(den));
            System.out.printf("%d/%d = %d/%d%n", num, den, num / gcd, den / gcd);
        }
        
        scanner.close();
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
