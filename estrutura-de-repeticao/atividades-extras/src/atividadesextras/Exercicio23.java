package atividadesextras;

import java.util.Scanner;

/*
 * Faça um programa que mostre todos os primos entre 1 e N sendo 
 * N um número inteiro fornecido pelo usuário. O programa deverá 
 * mostrar também o número de divisões que ele executou para encontrar 
 * os números primos. Serão avaliados o funcionamento, o estilo e o 
 * número de testes (divisões) executados.
 */

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int qtdeDivisores;
        int qtdeDivisoes;

        System.out.print("Informe um número: ");
        numero = leia.nextInt();
        leia.close();

        for (int i = 1; i < numero; i++) {
            qtdeDivisores = 0;
            qtdeDivisoes = 0;
            for (int c = i; c >= 1; c--) {
                qtdeDivisoes++;
                if (i % c == 0) {
                    qtdeDivisores++;
                }
            }
            if (qtdeDivisores == 2) {
                System.out.println("Número primo: " + i);
                System.out.println(
                        "Quantidade de divisões realizadas para verificar se esse número era primo: " + qtdeDivisoes);
            }
        }
    }
}