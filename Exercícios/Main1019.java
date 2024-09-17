import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundosTotais = scanner.nextInt();
        
        int horas = segundosTotais / 3600;
        segundosTotais %= 3600;
        int minutos = segundosTotais / 60;
        int segundos = segundosTotais % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        scanner.close();
    }
}
