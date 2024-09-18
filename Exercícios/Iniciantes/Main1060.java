import java.util.Scanner;

public class Main1060 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int count = 0;
        for (int i = 0; i < 6; i++) {
            double valor = in.nextDouble();
            if (valor > 0) {
                count++;
            }
        }
        
        System.out.println(count + " valores positivos");
        
        in.close();
    }
}
