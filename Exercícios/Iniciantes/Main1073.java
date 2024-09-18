import java.util.Scanner;

public class Main1073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }
        
        in.close();
    }
}
