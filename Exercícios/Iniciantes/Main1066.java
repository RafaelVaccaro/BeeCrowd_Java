import java.util.Scanner;

public class Main1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int countPares = 0;
        int countImpares = 0;
        int countPositivos = 0;
        int countNegativos = 0;
        
        for (int i = 0; i < 5; i++) {
            int valor = in.nextInt();
            
            if (valor % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
            
            if (valor > 0) {
                countPositivos++;
            } else if (valor < 0) {
                countNegativos++;
            }
        }
        
        System.out.println(countPares + " valor(es) par(es)");
        System.out.println(countImpares + " valor(es) impar(es)");
        System.out.println(countPositivos + " valor(es) positivo(s)");
        System.out.println(countNegativos + " valor(es) negativo(s)");
        
        in.close();
    }
}
