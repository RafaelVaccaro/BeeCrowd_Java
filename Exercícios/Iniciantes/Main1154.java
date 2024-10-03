import java.util.Scanner;

public class Main1154 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int idade;

        while (true) {
            idade = in.nextInt();
            if (idade < 0) {
                break;
            }
            cont++;
            soma += idade;
        }

        System.out.printf("%.2f\n", (double )soma/cont);
    }
}

