package atividadesextras;

import java.util.Scanner;
/*
 * Faça um programa que mostre os n termos da Série a seguir: S = 1/1 + 2/3 +
 * 3/5 + 4/7 + 5/9 + ... + n/m.
 */

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroDeTermos;
        int denominador = 1;

        do {
            System.out.print("Informe o número de termos: ");
            numeroDeTermos = leia.nextInt();
        } while (numeroDeTermos <= 0);
        leia.close();

        System.out.print("S = ");
        for (int i = 1; i <= numeroDeTermos; i++) {
            System.out.print(i + "/" + denominador);
            if (i != numeroDeTermos)
                System.out.print(" + ");
            denominador += 2;
        }
        System.out.println();
    }
}