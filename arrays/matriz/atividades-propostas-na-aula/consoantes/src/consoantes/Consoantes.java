package consoantes;

import java.util.Scanner;

/* Faça um Programa que leia um vetor de 6 caracteres, 
 * e diga quantas consoantes foram lidas. Imprima as 
 * consoantes.
 */
public class Consoantes {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        char[] vetor = new char[6];
        int i;
        int qtdeConsoantes = 0;

        for (i = 0; i < 6; i++) {
            System.out.print("Informe um caractere: ");
            vetor[i] = leia.next().charAt(0);

            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u')
                qtdeConsoantes++;
        }

        System.out.println("Quantidade de consoantes lidas: " + qtdeConsoantes);
        leia.close();
    }
}