package atividadesextras;

import java.util.Scanner;

/*
 * Faça um programa que peça um número inteiro e determine se ele é ou não um
 * número primo. Um número primo é aquele que é divisível somente por ele mesmo
 * e por 1.
 */

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número: ");
        numero = leia.nextInt();
        leia.close();

        int qtdeDivisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0)
                qtdeDivisores++;
        }
        if (qtdeDivisores != 2)
            System.out.println(numero + " não é número primo!\n");
        else
            System.out.println(numero + " é número primo!\n");
    }
}