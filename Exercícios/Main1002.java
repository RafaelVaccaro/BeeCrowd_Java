import java.util.Scanner;

public class Main1002 {

    public static final double pi = 3.14159;
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double raio = in.nextDouble();

        double area = pi * Math.sqrt(raio);

        System.out.println(area);
        
        in.close();

    }
}
