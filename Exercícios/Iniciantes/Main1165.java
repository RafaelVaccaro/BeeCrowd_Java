import java.util.Scanner;

public class Main1165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // número de casos

        for (int i = 0; i < n; i++) {
            int num = in.nextInt(); // número a ser verificado
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " eh primo");
            } else {
                System.out.println(num + " nao eh primo");
            }
        }
    }
}

