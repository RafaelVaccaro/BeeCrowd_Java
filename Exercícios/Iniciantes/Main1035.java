import java.util.Scanner;

public class Main1035
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //dados
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        
        //logica
        if ((B>C) && (D>A) && ((C+D)>(A+B)) && (C>0) && (D>0) && (A%2 == 0))
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
        in.close();
    }
}