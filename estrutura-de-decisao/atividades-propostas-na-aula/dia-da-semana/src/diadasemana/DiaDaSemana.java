package diadasemana;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        String diaDaSemana;

        System.out.print("Informe o dia da semana: ");
        diaDaSemana = leia.nextLine();

        switch (diaDaSemana) {
        case "SEGUNDA-FEIRA":
            System.out.println("2");
            break;

        case "TERÇA-FEIRA":
            System.out.println("3");
            break;

        case "QUARTA-FEIRA":
            System.out.println("4");
            break;

        case "QUINTA-FEIRA":
            System.out.println("5");
            break;

        case "SEXTA-FEIRA":
            System.out.println("6");
            break;

        case "SABADO":
            System.out.println("7");
            break;

        case "DOMINGO":
            System.out.println("1");
            break;

        default:
            System.out.println("Dia inválido!\n");
            break;
        }
    }
}