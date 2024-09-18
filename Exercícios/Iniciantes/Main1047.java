import java.util.Scanner;

public class Main1047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int horaInicio = in.nextInt();
        int minutoInicio = in.nextInt();
        int horaFim = in.nextInt();
        int minutoFim = in.nextInt();
        
        int totalInicio = horaInicio * 60 + minutoInicio;
        int totalFim = horaFim * 60 + minutoFim;
        
        int duracao;
        if (totalFim > totalInicio) {
            duracao = totalFim - totalInicio;
        } else {
            duracao = (24 * 60 - totalInicio) + totalFim;
        }
        
        int horas = duracao / 60;
        int minutos = duracao % 60;
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
        
        in.close();
    }
}
