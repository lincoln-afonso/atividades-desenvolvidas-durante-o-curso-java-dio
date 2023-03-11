package atividadesextras;

import java.util.Scanner;

/*
 * Crie uma matriz 4x4 e preencha a mesma com dados informados pelo usuário.
 * No final exiba a matriz e a quantidade de números pares e ímpares.
 */
public class Exercicio3 {

    public static void preencherMatriz(int[][] matriz, int numeroDeColunas) {
        Scanner leia = new Scanner(System.in);

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                System.out.print("Informe um número: ");
                matriz[l][c] = leia.nextInt();
            }
        }
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

    public static int verficarNumerosPares(int[][] matriz, int numeroDeColunas) {
        int qtdeNumeroPares = 0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                if (matriz[l][c] % 2 == 0)
                    qtdeNumeroPares++;
            }
        }
        return qtdeNumeroPares;
    }

    public static int verficarNumerosImpares(int[][] matriz, int numeroDeColunas) {
        int qtdeNumeroImpares = 0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                if (matriz[l][c] % 2 == 0)
                    qtdeNumeroImpares++;
            }
        }
        return qtdeNumeroImpares;
    }

    public static void main(String[] args) {
        final int TAM = 4;
        int[][] matriz = new int[TAM][TAM];

        Exercicio3.preencherMatriz(matriz, TAM);
        Exercicio3.exibirMatriz(matriz, TAM);
        System.out.println("\nQuantidade de números pares  : " + Exercicio3.verficarNumerosPares(matriz, TAM));
        System.out.println("Quantidade de números ímpares: " + Exercicio3.verficarNumerosImpares(matriz, TAM));
    }
}
