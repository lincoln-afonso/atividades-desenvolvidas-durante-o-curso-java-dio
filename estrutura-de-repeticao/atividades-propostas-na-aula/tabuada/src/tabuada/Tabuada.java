package tabuada;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
 * número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. 
 * A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */
public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Informe o número que deseja: ");
        numero = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }

        leia.close();
    }
}
