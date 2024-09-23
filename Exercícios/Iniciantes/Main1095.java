public class Main1095 {
    public static void main(String[] args) {

        int I = 1;
        int J = 60;

        do {
            System.out.printf("I=%d J=%d\n", I, J);
            I += 3;
            J -= 5;
        } while (J >= 0);
    }
}