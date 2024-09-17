import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int code1 = in.nextInt();
        int units1 = in.nextInt();
        double price1 = in.nextDouble();
        
        int code2 = in.nextInt();
        int units2 = in.nextInt();
        double price2 = in.nextDouble();
        
        double total = (units1 * price1) + (units2 * price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        in.close();
    }
}
