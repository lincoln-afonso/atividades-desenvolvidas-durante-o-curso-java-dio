package arraymultidimensional;

import java.util.Scanner;
import java.util.Random;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 * Após isso determine o menor número da matriz e a sua posição(linha, coluna). 
 */
public class ArrayMultidimensional {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int menorElemento = 0;
        int linha = 0;
        int coluna = 0;

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                matriz[l][c] = random.nextInt(9);
                System.out.print(matriz[l][c] + " ");

                if (l == 0 && c == 0) {
                    menorElemento = matriz[l][c];
                } else {
                    if (matriz[l][c] < menorElemento) {
                        menorElemento = matriz[l][c];
                        linha = l;
                        coluna = c;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Menor elemento da matriz: " + menorElemento);
        System.out.println("Lnnha = " + linha);
        System.out.println("Coluna = " + coluna);
        leia.close();
    }
}