import java.util.Scanner;

public class Main1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasTotais = scanner.nextInt();
        
        int anos = diasTotais / 365;
        diasTotais %= 365;
        int meses = diasTotais / 30;
        int dias = diasTotais % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        scanner.close();
    }
}
