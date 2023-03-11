package atividadesextras;

import java.util.Scanner;

/*
 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa capaz de gerar a série até o n−ésimo termo.
 */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroDeTermos;

        do {
            System.out.print("Informe o número de termos: ");
            numeroDeTermos = leia.nextInt();

            if (numeroDeTermos <= 0)
                System.out.println("Número inválido, tente novamente!\n");
        } while (numeroDeTermos <= 0);

        leia.close();
    }
}