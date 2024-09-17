import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();
        int velocidade = in.nextInt();
        
        double litros = (tempo * velocidade) / 12.0;
        System.out.printf("%.3f%n", litros);
        
        in.close();
    }
}
