package pareimpar;

import java.util.Scanner;

/* Faça um programa que peça N números inteiros. 
 * Calcule e mostre a quantidade de números pares e a quantidade de números impares. 
 */
public class ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int qtdeDeNumeros; // QUANTIDADE DE NÚMEROS QUE SERÃO LIDOS
        int qtdeDeNumerosPares = 0;
        int qtdeDeNumerosImpares = 0;
        int numero;

        System.out.print("Informe a quantidade de números que serão lidos: ");
        qtdeDeNumeros = leia.nextInt();

        if (qtdeDeNumeros > 0) {
            for (int i = 0; i < qtdeDeNumeros; i++) {
                System.out.print("Informe um número: ");
                numero = leia.nextInt();

                if (numero == 0 || numero % 2 == 0)
                    qtdeDeNumerosPares++;
                else
                    qtdeDeNumerosImpares++;
            }
            System.out.println("Quantidade de números pares: " + qtdeDeNumerosPares);
            System.out.println("Quantidade de números pares: " + qtdeDeNumerosImpares);
        } else
            System.out.println("Não foi informado um valor válido!");
        leia.close();
    }
}
