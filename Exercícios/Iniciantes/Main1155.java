public class Main1155 {
    public static void main(String[] args) {

        double S = 0.0;
        double numerador = 1.0;

        for (int i = 1; i <= 100; i++) {
            S += numerador/i;
        }

        System.out.printf("%.2f\n", S);
    }
}

