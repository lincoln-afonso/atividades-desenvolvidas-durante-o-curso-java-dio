package nota;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. 
  Mostre uma mensagem caso o valor seja inválido e continue pedindo
  até que o usuário informe um valor válido.
*/
public class Nota {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        double nota;

        while (true) {
            System.out.print("Informe a nota: ");
            nota = leia.nextDouble();

            if (nota < 0 || nota > 10)
                System.out.println("Nota inválida!\n");
            else
                break;
        }

        /*
         * do { System.out.print("Informe a nota: "); nota = leia.nextDouble();
         * 
         * if (nota < 0 || nota > 10) System.out.println("Nota inválida!\n"); } while
         * (nota < 0 || nota > 10);
         */

        leia.close();
    }
}