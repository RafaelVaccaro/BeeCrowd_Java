public class Main1156 {
    public static void main(String[] args) {

        double S = 1.0;
        double numerador = 3.0;
        double denominador = 2.0;

        while (numerador <= 39) {
            S += numerador/denominador;
            numerador += 2;
            denominador *= 2;
        }

        System.out.printf("%.2f\n", S);
    }
}

