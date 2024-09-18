import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int segundosTotais = in.nextInt();
        
        int horas = segundosTotais / 3600;
        segundosTotais %= 3600;
        int minutos = segundosTotais / 60;
        int segundos = segundosTotais % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        in.close();
    }
}
