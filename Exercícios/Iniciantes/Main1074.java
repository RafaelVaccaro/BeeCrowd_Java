import java.util.Scanner;

public class Main1074 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            int valor = in.nextInt();
            
            if (valor == 0) {
                System.out.println("NULL");
            } else {
                if (valor % 2 == 0) {
                    if (valor > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (valor > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }
        
        in.close();
    }
}
