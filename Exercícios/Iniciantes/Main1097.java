public class Main1097 {
    public static void main(String[] args) {
        int I = 1;
        int J = 7;

        while (I < 10) {
            for (int index = 0; index < 3; index++) {
                System.out.printf("I=%d J=%d\n", I, J);
                J--;
            }
            I += 2;
            J += 5;
        }
    }
}
