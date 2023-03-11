package maioremedia;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior número
 * e a média desses números.
 */
public class MaiorEMedia {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        double somaNumero = 0;
        int numero;
        int maiorNumero = 0;
        int contador = 0;
        final int QTDE_NUMEROS = 5;

        do {
            System.out.print("Informe um número qualquer: ");
            numero = leia.nextInt();

            if (contador == 0)
                maiorNumero = numero;
            else {
                if (numero > maiorNumero)
                    maiorNumero = numero;
            }
            somaNumero += numero;
            contador++;
        } while (contador < QTDE_NUMEROS);
        leia.close();

        System.out.println("Maior número: " + maiorNumero);
        if (somaNumero != 0)
            System.out.println("Média dos números lidos: " + somaNumero / QTDE_NUMEROS);
        else
            System.out.println("Não foi possível obter a média!\n");
    }
}
