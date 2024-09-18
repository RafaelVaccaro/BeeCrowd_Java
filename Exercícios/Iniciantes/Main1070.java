import java.util.Scanner;

public class Main1070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int count = 0;
        
        while (count < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                count++;
            }
            x++;
        }
        
        in.close();
    }
}
