package prova;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        float frequencia;
        float nota;

        do {
            System.out.print("Frequência: ");
            frequencia = leia.nextFloat();
        } while (frequencia < 0 || frequencia > 100);

        do {
            System.out.print("Nota: ");
            nota = leia.nextFloat();
        } while (nota < 0 || nota > 10);

        if (frequencia < 75)
            System.out.println("Reprovado!\n");
        else {
            if (nota < 3)
                System.out.println("Reprovado!\n");
            else if (nota < 7)
                System.out.println("Exame!\n");
            else
                System.out.println("Aprovado!");
        }

        leia.close();
    }
}