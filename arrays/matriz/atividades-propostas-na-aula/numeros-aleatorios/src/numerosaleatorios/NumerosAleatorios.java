package numerosaleatorios;

import java.util.Scanner;

/* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * armazene-os num vetor. Ao final, mostre os números e seus sucessores. 
 */
public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Informe um número: ");
                vetor[i] = leia.nextInt();
            } while (vetor[i] < 0 || vetor[i] > 100);
        }

        System.out.println("\nNúmero \tSucessor");
        for (int i = 0; i < 20; i++) {
            System.out.println(vetor[i] + "\t" + (vetor[i] + 1));
        }
        leia.close();
    }
}