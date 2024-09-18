import java.util.Scanner;

public class Main1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salario = in.nextDouble();
        double novoSalario, reajuste;
        int percentual;
        
        if (salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <= 1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }
        
        reajuste = salario * percentual / 100;
        novoSalario = salario + reajuste;
        
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
        
        in.close();
    }
}
