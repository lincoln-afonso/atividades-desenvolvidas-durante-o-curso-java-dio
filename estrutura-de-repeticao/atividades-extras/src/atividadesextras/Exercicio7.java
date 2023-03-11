package atividadesextras;

/* Faça um programa que leia 5 números e informe o maior número.
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            numero = leia.nextInt();
            if (i == 0)
                maior = numero;
            else {
                if (numero > maior)
                    maior = numero;
            }
        }
        System.out.println("Miaor número: " + maior);
        leia.close();
    }
}
