import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int inInterval = 0;
        int outInterval = 0;
        
        for (int i = 0; i < n; i++) {
            int valor = in.nextInt();
            if (valor >= 10 && valor <= 20) {
                inInterval++;
            } else {
                outInterval++;
            }
        }
        
        System.out.println(inInterval + " in");
        System.out.println(outInterval + " out");
        
        in.close();
    }
}
