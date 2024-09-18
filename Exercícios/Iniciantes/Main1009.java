import java.util.Scanner;

public class Main1009 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        double salary = in.nextDouble();
        double sales = in.nextDouble();
        double total = salary + (sales * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", total);
        in.close();
        
    }
}
