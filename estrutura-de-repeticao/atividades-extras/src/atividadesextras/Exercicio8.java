package atividadesextras;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe a soma e a média dos números.
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int somaNumero = 0;
        float media;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            numero = leia.nextInt();
            somaNumero += numero;
        }

        System.out.println("Soma dos números = " + somaNumero);
        if (somaNumero == 0)
            System.out.println("Impossível calcular a média!\n");
        else {
            media = somaNumero / 5.0f;
            System.out.println("Média = " + media);
        }

        leia.close();
    }
}