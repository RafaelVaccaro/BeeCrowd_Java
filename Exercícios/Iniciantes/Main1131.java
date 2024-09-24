import java.util.Scanner;

public class Main1131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ctrl = true;
        int grenais = 0;
        int vitInter = 0;
        int vitGremio = 0;
        int empates = 0;

        while (ctrl) {
            int golsInter = in.nextInt();
            int golsGremio = in.nextInt();
            if (golsInter > golsGremio) {
                vitInter++;
            } else if (golsInter < golsGremio) {
                vitGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            int ng = in.nextInt();

            if (ng == 2) {
                ctrl = false;
            }
            grenais++;
        }
        System.out.printf("%d grenais\n", grenais);
        System.out.printf("Inter:%d\n", vitInter);
        System.out.printf("Gremio:%d\n", vitGremio);
        System.out.printf("Empates:%d\n", empates);
        if (vitInter > vitGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitInter < vitGremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        in.close();
    }
}
