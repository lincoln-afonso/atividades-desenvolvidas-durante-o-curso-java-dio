package atividadesextras;

import java.util.Scanner;

/*
 * Altere o programa de cálculo dos números primos, informando, 
 * caso o número não seja primo, por quais número ele é divisível.
 */

public class Exercicio22 {
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
        if (qtdeDivisores != 2) {
            System.out.println(numero + " não é número primo.\n");
            System.out.print("Seu(s) divisor(es) é(são): ");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        } else
            System.out.println(numero + " é número primo!\n");
    }
}