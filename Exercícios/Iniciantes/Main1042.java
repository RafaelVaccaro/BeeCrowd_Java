import java.util.Scanner;
import java.util.Arrays;

public class Main1042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] values = new int[3];
        values[0] = in.nextInt();
        values[1] = in.nextInt();
        values[2] = in.nextInt();
        
        int[] sortedValues = values.clone();
        Arrays.sort(sortedValues);
        
        for (int val : sortedValues) {
            System.out.println(val);
        }
        System.out.println();
        for (int val : values) {
            System.out.println(val);
        }
        
        in.close();
    }
}
