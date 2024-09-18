import java.util.Scanner;

public class Main1094 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        int total = 0, totalC = 0, totalR = 0, totalS = 0;
        double pC, pR, pS;

        for (int i = 0; i < casos; i++) {
            int qtd = in.nextInt();
            String tipo = in.next();
            switch (tipo) {
                case "C":
                    total += qtd;
                    totalC += qtd;
                    break;
                case "R":
                    total += qtd;
                    totalR += qtd;
                    break;
                case "S":
                    total += qtd;
                    totalS += qtd;
                    break;
            }
        }
        pC = (100.00 * totalC) / (double) total;
        pR = (100.00 * totalR) / (double) total;
        pS = (100.00 * totalS) / (double) total;
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", totalC);
        System.out.printf("Total de ratos: %d\n", totalR);
        System.out.printf("Total de sapos: %d\n", totalS);
        System.out.printf("Percentual de coelhos: %.2f \n", pC);
        System.out.printf("Percentual de ratos: %.2f \n", pR);
        System.out.printf("Percentual de sapos: %.2f \n", pS);
        in.close();
    }
}
