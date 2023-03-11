package atividadesextras;

import java.util.Scanner;

/*
 * Leia uma matriz de dimensões informada pelo usuário e encontre a primeira ocorrência 
 * do valor máximo e a última ocorência do valor mínimo.
 * 
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int linha;
        int coluna;
        int[] posicao;

        do {
            System.out.print("Número de linhas: ");
            linha = leia.nextInt();
        } while (linha <= 0);

        do {
            System.out.print("Número de colunas: ");
            coluna = leia.nextInt();
        } while (coluna <= 0);

        int[][] matriz = new int[linha][coluna];
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.print("Digite um valor: ");
                matriz[l][c] = leia.nextInt();
            }
        }
        leia.close();
        Exercicio4.exibirMatriz(matriz, coluna);
        posicao = Exercicio4.verificarPrimeiraOcorrenciaValorMaximo(matriz, coluna);
        System.out.println("1ª ocorrência do valor máximo: linha " + posicao[0] + " e coluna " + posicao[1]);
        posicao = Exercicio4.verificarUltimaOcorrenciaValorMinimo(matriz, coluna);
        System.out.println("Última ocorrência do valor minimo: linha " + posicao[0] + " e coluna " + posicao[1]);
        leia.close();
    }

    public static void exibirMatriz(int[][] matriz, int numeroDeColunas) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[] verificarPrimeiraOcorrenciaValorMaximo(int[][] matriz, int numeroDeColunas) {
        int[] posicao = new int[2];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                if (l == 0 && c == 0) {
                    posicao[0] = l;
                    posicao[1] = l;
                } else {
                    if (matriz[l][c] > matriz[posicao[0]][posicao[1]]) {
                        posicao[0] = l;
                        posicao[1] = c;
                    }
                }
            }
        }
        return posicao;
    }

    public static int[] verificarUltimaOcorrenciaValorMinimo(int[][] matriz, int numeroDeColunas) {
        int[] posicao = new int[2];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                if (l == 0 && c == 0) {
                    posicao[0] = l;
                    posicao[1] = l;
                } else {
                    if (matriz[l][c] <= matriz[posicao[0]][posicao[1]]) {
                        posicao[0] = l;
                        posicao[1] = c;
                    }
                }
            }
        }
        return posicao;
    }
}