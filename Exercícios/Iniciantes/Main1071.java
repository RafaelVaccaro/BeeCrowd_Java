import java.util.Scanner;

public class Main1071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        
        int soma = 0;
        
        int inicio = Math.min(x, y) + 1;
        int fim = Math.max(x, y);
        
        for (int i = inicio; i < fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        
        System.out.println(soma);
        
        in.close();
    }
}
