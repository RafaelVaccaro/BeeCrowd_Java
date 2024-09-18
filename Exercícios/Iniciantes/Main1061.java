import java.util.Scanner;

public class Main1061 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Dia de início
        in.next(); // "Dia"
        int diaInicio = in.nextInt();
        
        // Hora de início
        int horaInicio = in.nextInt();
        String doisPontos = in.next(); // ":"
        int minutoInicio = in.nextInt();
        doisPontos = in.next();
        int segundoInicio = in.nextInt();
        
        // Dia de fim
        in.next(); // "Dia"
        int diaFim = in.nextInt();
        
        // Hora de fim
        int horaFim = in.nextInt();
        doisPontos = in.next();
        int minutoFim = in.nextInt();
        doisPontos = in.next();
        int segundoFim = in.nextInt();
        
        // Converter tudo para segundos
        int inicioTotalSegundos = segundoInicio + minutoInicio * 60 + horaInicio * 3600 + diaInicio * 86400;
        int fimTotalSegundos = segundoFim + minutoFim * 60 + horaFim * 3600 + diaFim * 86400;
        
        // Diferença em segundos
        int duracaoSegundos = fimTotalSegundos - inicioTotalSegundos;
        
        // Converter de volta para dias, horas, minutos e segundos
        int dias = duracaoSegundos / 86400;
        duracaoSegundos %= 86400;
        
        int horas = duracaoSegundos / 3600;
        duracaoSegundos %= 3600;
        
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        
        System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);
        
        in.close();
    }
}
