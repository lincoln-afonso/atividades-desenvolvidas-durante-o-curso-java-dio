package fatorial;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número
 * inteiro fornecido pelo usuário.
 * Ex.: 5!=5.4.3.2.1=120 
 */
public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int fatorial = 1;
        int numero;

        System.out.print("Informe o número que deseja obter o fatorial: ");
        numero = leia.nextInt();
        leia.close();

        if (numero >= 0) {
            for (int contador = numero; contador >= 1; contador--) {
                fatorial *= contador;
                if (contador == numero)
                    System.out.print(numero + "! = ");

                System.out.print(contador);

                if (contador != 1)
                    System.out.print(" . ");
            }
            System.out.println(" = " + fatorial);
        } else
            System.out.println("Não existe fatorial de números negativos!\n");
    }
}
