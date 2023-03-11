package atividadesextras;

import java.util.Random;
/* 
 * Gerar uma matriz 4x4 com números aleatórios e logo após deve ser exibido o 
 * maior elemento e sua posição (linha, coluna) na matriz.  
 */

public class Exercicio1 {
    public static void exibirElementos(int[][] matriz, int numeroDeColunas) {
        System.out.println("-------------------------------------");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

    public static void preencherMatriz(int[][] matriz, int numeroDeColunas) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                matriz[l][c] = Exercicio1.gerarNumero();
            }
        }
    }

    private static int gerarNumero() {
        Random random = new Random();

        return random.nextInt(100);
    }

    public static int pesquisarMaiorElemento(int[][] numero, int numeroDeColunas) {
        int maiorElemento = 0;

        for (int l = 0; l < numero.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                if (l == 0 && c == 0)
                    maiorElemento = numero[l][c];
                else {
                    if (numero[l][c] > maiorElemento)
                        maiorElemento = numero[l][c];
                }
            }
        }
        return maiorElemento;
    }

    public static int[] pesquisarPosicaoMaiorElemento(int[][] numero, int numeroDeColunas) {
        int[] posicao = new int[2];

        for (int l = 0; l < numero.length; l++) {
            for (int c = 0; c < numeroDeColunas; c++) {
                if (l == 0 && c == 0) {
                    posicao[0] = l;
                    posicao[1] = c;
                } else {
                    if (numero[l][c] > numero[posicao[0]][posicao[1]]) {
                        posicao[0] = l;
                        posicao[1] = c;
                    }
                }

            }
        }
        return posicao;

    }

    public static void main(String[] args) throws Exception {
        final int TAM = 4;
        int[][] numero = new int[TAM][TAM];
        int[] posicao;

        Exercicio1.exibirElementos(numero, TAM);
        Exercicio1.preencherMatriz(numero, TAM);
        Exercicio1.exibirElementos(numero, TAM);

        System.out.println("\nMaior elemento: " + Exercicio1.pesquisarMaiorElemento(numero, TAM));
        posicao = Exercicio1.pesquisarPosicaoMaiorElemento(numero, TAM);
        System.out.println("Linha : " + posicao[0]);
        System.out.println("Coluna: " + posicao[1] + "\n");
    }
}