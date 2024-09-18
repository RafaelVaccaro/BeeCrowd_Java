import java.util.Scanner;

public class Main1064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int count = 0;
        double soma = 0;
        
        for (int i = 0; i < 6; i++) {
            double valor = in.nextDouble();
            if (valor > 0) {
                count++;
                soma += valor;
            }
        }
        
        double media = soma / count;
        
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", media);
        
        in.close();
    }
}
