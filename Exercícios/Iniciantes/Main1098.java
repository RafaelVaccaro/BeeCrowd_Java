public class Main1098 {
    public static void main(String[] args) {
        double I = 0.0;
        double J = 1.0;
        int control = 0;

        while (I < 2.1) {
            for (int index = 0; index < 3; index++) {
                if (control == 0 || control == 5 || control == 10) {
                    System.out.printf("I=%.0f J=%.0f\n", I, J);
                    J++;
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", I, J);
                    J++;
                }
            }
            I += 0.2;
            J -= 2.8;
            control++;
        }
    }
}
