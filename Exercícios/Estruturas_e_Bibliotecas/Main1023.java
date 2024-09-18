import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int control = 1;
        boolean firstOutput = true;

        while (true) {
            int qtdImv = in.nextInt();
            if (qtdImv == 0) {
                break;
            }

            Map<Integer, int[]> mapConsumo = new HashMap<>();
            int totalMoradores = 0;
            int totalConsumo = 0;

            for (int i = 0; i < qtdImv; i++) {
                int qtdMoradores = in.nextInt();
                int consumoTotal = in.nextInt();
                int consumoPessoal = consumoTotal / qtdMoradores;

                int[] dados = mapConsumo.getOrDefault(consumoPessoal, new int[2]);
                dados[0] += qtdMoradores; // Soma os moradores
                dados[1] += consumoTotal; // Soma o consumo total

                mapConsumo.put(consumoPessoal, dados);

                totalMoradores += qtdMoradores;
                totalConsumo += consumoTotal;
            }

            if (!firstOutput) {
                System.out.println();
            }
            firstOutput = false;

            int[][] matriz = new int[mapConsumo.size()][2];
            int index = 0;
            for (Map.Entry<Integer, int[]> entry : mapConsumo.entrySet()) {
                matriz[index][0] = entry.getValue()[0]; // Número de moradores
                matriz[index][1] = entry.getKey();      // Consumo pessoal (m3/morador)
                index++;
            }

            // Ordena pela chave (consumo pessoal)
            Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

            // Exibe o número da cidade
            System.out.printf("Cidade# %d:\n", control++);
            for (int i = 0; i < matriz.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.printf("%d-%d", matriz[i][0], matriz[i][1]);
            }

            // Calcula e imprime o consumo médio
            float consumoMedio = (float) totalConsumo / totalMoradores;
            System.out.printf("\nConsumo medio: %.2f m3.\n", Math.floor(consumoMedio * 100) / 100);
        }

        in.close();
    }
}
