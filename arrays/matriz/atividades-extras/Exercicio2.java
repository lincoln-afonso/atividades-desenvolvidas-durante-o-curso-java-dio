package atividadesextras;

import java.util.Random;

/*
 * Fazer um programa que preencha uma matriz 10x10 e encontre o maior e o menor 
 * elemento da linha 5.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        final int LIN = 10;
        int[][] matriz = new int[LIN][LIN];
        int linha = 5;

        Exercicio2.exibirElementos(matriz, LIN);
        Exercicio2.preencherMatriz(matriz, LIN);
        Exercicio2.exibirElementos(matriz, LIN);
        System.out.println(
                "\nMaior elemento da linha " + linha + ": " + Exercicio2.pesquisarMaiorElemento(matriz, LIN, linha));
        System.out.println(
                "Menor elemento da linha " + linha + ": " + Exercicio2.pesquisarMenorElemento(matriz, LIN, linha));

    }

    public static void exibirElementos(int[][] matriz, int numeroDeColunas) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

    private static int gerarNumero() {
        Random random = new Random();

        return random.nextInt(100);
    }

    public static void preencherMatriz(int[][] matriz, int numeroDeColunas) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                matriz[l][c] = Exercicio2.gerarNumero();
            }
        }
    }

    public static int pesquisarMaiorElemento(int[][] matriz, int numeroDeColunas, int linha) {
        int maiorElemento = 0;

        for (int c = 0; c < numeroDeColunas; c++) {
            if (c == 0)
                maiorElemento = matriz[linha][c];
            else {
                if (matriz[linha][c] > maiorElemento)
                    maiorElemento = matriz[linha][c];
            }
        }
        return maiorElemento;
    }

    public static int pesquisarMenorElemento(int[][] matriz, int numeroDeColunas, int linha) {
        int menorElemento = 0;

        for (int c = 0; c < numeroDeColunas; c++) {
            if (c == 0)
                menorElemento = matriz[linha][c];
            else {
                if (matriz[linha][c] < menorElemento)
                    menorElemento = matriz[linha][c];
            }
        }
        return menorElemento;
    }
}