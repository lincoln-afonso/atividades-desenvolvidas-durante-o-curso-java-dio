package atividadesextras;

import java.util.Scanner;
/*
 * Faça um programa que, dado um conjunto de N números, determine o menor
 * valor, o maior valor e a soma dos valores.
 */

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroDeElementos;

        System.out.print("Informe o número de elementos que serão informados: ");
        numeroDeElementos = leia.nextInt();

        if (numeroDeElementos > 1) {
            int soma = 0;
            int menor = 0;
            int maior = 0;
            int numero;
            for (int i = 0; i < numeroDeElementos; i++) {
                System.out.print("Informe um número: ");
                numero = leia.nextInt();
                if (i == 0) {
                    menor = numero;
                    maior = numero;
                } else {
                    if (numero < menor)
                        menor = numero;
                    else if (numero > maior)
                        maior = numero;
                }
                soma += numero;
            }
            System.out.println("Soma dos números lidos = " + soma);
            System.out.println("Maior elemento = " + maior);
            System.out.println("Menor elemento = " + menor);
        } else
            System.out.println("O número de elementos deve ser maior ou igual a 2.\n");
        leia.close();
    }
}