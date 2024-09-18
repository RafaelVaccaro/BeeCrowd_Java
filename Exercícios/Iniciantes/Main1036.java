import java.util.Scanner;
public class Main1036
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //dados
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        //calculos
        double delta = ((Math.pow(b, 2)) - 4 * a * c);
        double raiz = (Math.sqrt(delta));
        double x1 = (-b + raiz)/(2*a);
        double x2 = (-b - raiz)/(2*a);
        
        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
            System.out.printf("R1 = " + "%.5f", x1); 
            System.out.println();
            System.out.printf("R2 = " + "%.5f", x2);
            System.out.println();
        }
        in.close();
    }
}
