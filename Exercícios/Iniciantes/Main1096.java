public class Main1096 {
    public static void main(String[] args) {

        int I = 1;
        int J = 7;

        while (I <= 9) {

            System.out.println("I=" + I + " J=" + J);

            if (J != 5) {
                J = J - 1;
            } else {
                I = I + 2;
                J = J + 2;
            }

        }
    }
}