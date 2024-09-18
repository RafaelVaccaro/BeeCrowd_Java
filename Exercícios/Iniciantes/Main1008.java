import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int hours = in.nextInt();
        double rate = in.nextDouble();
        double salary = hours * rate;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        in.close();
    }
}
