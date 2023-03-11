package atividadesextras;

import java.util.Scanner;
/*
 * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o
 * fatorial várias vezes e limitando o fatorial a números inteiros positivos e
 * menores que 16.
 */

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int fatorial;

        do {
            fatorial = 1;
            System.out.print("Informe um número: ");
            numero = leia.nextInt();

            if (numero >= 0 && numero <= 16) {
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                System.out.println("Fatorial de " + numero + " = " + fatorial);
            } else
                System.out.println("Número negativo ou maior que 16 não são aceitos!\n");
        } while (numero >= 0 && numero <= 16);

        leia.close();
    }
}