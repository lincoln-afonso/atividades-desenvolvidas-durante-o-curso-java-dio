package atividadesextras;

import java.util.Scanner;

/* Faça um programa que receba dois números inteiros e gere os números inteiros que estão no 
 * intervalo compreendido por eles.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.print("Informe o 1º número: ");
        primeiroNumero = leia.nextInt();

        System.out.print("Informe o 2º número: ");
        segundoNumero = leia.nextInt();

        if (primeiroNumero != segundoNumero) {
            if (primeiroNumero < segundoNumero && segundoNumero - primeiroNumero > 1) {
                for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
                    System.out.println(i);
                }
            } else if (primeiroNumero - segundoNumero > 1) {
                for (int i = segundoNumero + 1; i < primeiroNumero; i++) {
                    System.out.println(i);
                }
            } else
                System.out.println("O intervalo entre um número e outro deve ser maior que 1.");

        } else
            System.out.println("Não é possível exibir os números interiros entre os "
                    + "números informados pois eles são iguais!\n");
        leia.close();
    }
}