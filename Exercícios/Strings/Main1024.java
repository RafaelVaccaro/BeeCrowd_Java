import java.util.Scanner;

public class Main1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nTestes = in.nextInt();
        in.nextLine(); // Consumir a linha restante após nextInt()

        for (int i = 0; i < nTestes; i++) {
            String msg = in.nextLine();
            char[] msgChar = msg.toCharArray();
            msgChar = primeiraPassada(msgChar);
            msgChar = segundaPassada(msgChar);
            String resultado = terceiraPassada(msgChar);
            System.out.println(resultado);
        }
        in.close();
    }

    public static char[] primeiraPassada(char[] mensagem) {
        for (int i = 0; i < mensagem.length; i++) {
            if (Character.isLetter(mensagem[i])) {
                mensagem[i] = (char) (mensagem[i] + 3);
            }
        }
        return mensagem;
    }

    public static char[] segundaPassada(char[] mensagem) {
        int esquerda = 0;
        int direita = mensagem.length - 1;

        while (esquerda < direita) {
            char temp = mensagem[esquerda];
            mensagem[esquerda] = mensagem[direita];
            mensagem[direita] = temp;

            esquerda++;
            direita--;
        }
        return mensagem;
    }

    public static String terceiraPassada(char[] mensagem) {
        for (int i = mensagem.length - 1; i >= mensagem.length / 2; i--) {
            mensagem[i] = (char) (mensagem[i] - 1);
        }
        return new String(mensagem);
    }
}
