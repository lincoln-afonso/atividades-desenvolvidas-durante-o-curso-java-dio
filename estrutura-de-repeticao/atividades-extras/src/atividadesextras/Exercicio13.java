package atividadesextras;

import java.util.Scanner;

/*
 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
 * primeiro número elevado ao segundo número. Não utilize a função de potência
 * da linguagem.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double base;
        int expoente;
        double resultado = 1;

        System.out.print("Base: ");
        base = leia.nextDouble();
        System.out.print("Expoente: ");
        expoente = leia.nextInt();

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
        leia.close();
    }
}
