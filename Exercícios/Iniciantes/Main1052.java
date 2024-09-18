import java.util.Scanner;

public class Main1052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int mes = in.nextInt();
        
        String[] meses = {"January", "February", "March", "April", "May", "June", 
                          "July", "August", "September", "October", "November", "December"};
        
        System.out.println(meses[mes - 1]);
        
        in.close();
    }
}
