import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int horaInicio = in.nextInt();
        int horaFim = in.nextInt();
        
        int duracao;
        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        
        in.close();
    }
}
