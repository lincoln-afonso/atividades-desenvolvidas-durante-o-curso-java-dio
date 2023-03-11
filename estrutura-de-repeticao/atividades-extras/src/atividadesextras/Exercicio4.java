package atividadesextras;

import java.util.Scanner;

/* Supondo que a população de um país A seja da ordem de 80000 habitantes
 * com uma taxa anual de crescimento de 3% e que a população de B seja 200000
 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
 * e escreva o número de anos necessários para que a população do país A ultrapasse
 * ou iguale a população do país B, mantidas as taxas de crescimento.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdeAnos = 0;
        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;

        while (populacaoPaisA <= populacaoPaisB) {
            qtdeAnos++;
            populacaoPaisA += populacaoPaisA * 0.03;
            populacaoPaisB += populacaoPaisB * 0.015;
            System.out.println("População país A: " + populacaoPaisA);
            System.out.println("População país B: " + populacaoPaisB);
        }

        System.out.println(
                "\nQuantidade de anos necessários para que o país A iguale ou ultrapase a população doa país B: "
                        + qtdeAnos);
        leia.close();
    }
}