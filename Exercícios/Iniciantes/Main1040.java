import java.util.Scanner;

public class Main1040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double N1 = in.nextDouble();
        double N2 = in.nextDouble();
        double N3 = in.nextDouble();
        double N4 = in.nextDouble();
        
        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.printf("Media: %.1f\n", media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = in.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            media = (media + notaExame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }
        
        in.close();
    }
}
