import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia = in.nextInt();
        
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");
        
        in.close();
    }
}
