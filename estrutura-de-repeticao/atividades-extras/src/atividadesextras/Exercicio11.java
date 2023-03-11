package atividadesextras;

import java.util.Scanner;

/* Altere o programa anterior para mostrar no final a soma dos números.
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int soma = 0;

        System.out.print("Informe o 1º número: ");
        primeiroNumero = leia.nextInt();

        System.out.print("Informe o 2º número: ");
        segundoNumero = leia.nextInt();

        if (primeiroNumero != segundoNumero) {
            if (primeiroNumero < segundoNumero && segundoNumero - primeiroNumero > 1) {
                for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
                    soma += i;

                }
                System.out.println("Soma dos números entre " + primeiroNumero + " e " + segundoNumero + ": " + soma);
            } else if (primeiroNumero - segundoNumero > 1) {
                for (int i = segundoNumero + 1; i < primeiroNumero; i++) {
                    soma += i;
                }
                System.out.println("Soma dos números entre " + segundoNumero + " e " + primeiroNumero + ": " + soma);
            } else
                System.out.println("O intervalo entre um número e outro deve ser maior que 1.");

        } else
            System.out.println("Não é possível exibir os números interiros entre os "
                    + "números informados pois eles são iguais!\n");
        leia.close();
    }
}