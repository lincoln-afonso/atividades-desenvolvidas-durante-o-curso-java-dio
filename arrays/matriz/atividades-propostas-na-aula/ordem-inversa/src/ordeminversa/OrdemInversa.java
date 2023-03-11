package ordeminversa;

import java.util.Scanner;

/*  Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("Ordem que os elementos foram inseridos");
        for (i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("\nOrdem inversa");
        for (i = 4; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        leia.close();
    }
}