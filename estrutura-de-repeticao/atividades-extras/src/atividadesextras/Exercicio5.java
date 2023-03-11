package atividadesextras;

import java.util.Scanner;

/* Altere o programa anterior permitindo ao usuário informar
 * as populações e as taxas de crescimento iniciais. Valide a
 * entrada e permita repetir a operação.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdeAnos = 0;
        float populacaoPaisA;
        float populacaoPaisB;
        float taxaCrescimentoPaisA;
        float taxaCrescimentoPaisB;

        do {
            System.out.print("Informe a população do país A: ");
            populacaoPaisA = leia.nextFloat();

            if (populacaoPaisA <= 0)
                System.out.println("População inválida!\n");
        } while (populacaoPaisA <= 0);

        do {
            System.out.print("Informe a taxa de crescimento do país A: ");
            taxaCrescimentoPaisA = leia.nextFloat();

            if (taxaCrescimentoPaisA <= 0)
                System.out.println("Taxa inválida!\n");
        } while (taxaCrescimentoPaisA <= 0);

        do {
            System.out.print("Informe a população do país B: ");
            populacaoPaisB = leia.nextFloat();

            if (populacaoPaisB <= 0)
                System.out.println("População inválida!\n");
        } while (populacaoPaisB <= 0);

        do {
            System.out.print("Informe a taxa de crescimento do país B: ");
            taxaCrescimentoPaisB = leia.nextFloat();

            if (taxaCrescimentoPaisB <= 0)
                System.out.println("Taxa inválida!\n");
        } while (taxaCrescimentoPaisB <= 0);

        while (populacaoPaisA <= populacaoPaisB) {
            qtdeAnos++;
            populacaoPaisA += populacaoPaisA * taxaCrescimentoPaisA;
            populacaoPaisB += populacaoPaisB * taxaCrescimentoPaisB;
            System.out.println("População país A: " + populacaoPaisA);
            System.out.println("População país B: " + populacaoPaisB);
        }

        System.out.println(
                "\nQuantidade de anos necessários para que o país A iguale ou ultrapase a população doa país B: "
                        + qtdeAnos);
        leia.close();
    }
}