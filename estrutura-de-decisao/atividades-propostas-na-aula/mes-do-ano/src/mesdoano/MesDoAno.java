package mesdoano;

import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int numeroDoMes;

        System.out.print("Informe o número que correponde ao mês desejado: ");
        numeroDoMes = leia.nextInt();

        if (numeroDoMes == 1)
            System.out.println("JANEIRO");

        else if (numeroDoMes == 2)
            System.out.println("FEVEREIRO");

        else if (numeroDoMes == 3)
            System.out.println("MARÇO");

        else if (numeroDoMes == 4)
            System.out.println("ABRIL");

        else if (numeroDoMes == 5)
            System.out.println("MAIO");

        else if (numeroDoMes == 6)
            System.out.println("JUNHO");

        else if (numeroDoMes == 7)
            System.out.println("JULHO");

        else if (numeroDoMes == 8)
            System.out.println("AGOSTO");

        else if (numeroDoMes == 9)
            System.out.println("SETEMBRO");

        else if (numeroDoMes == 10)
            System.out.println("OUTUBRO");

        else if (numeroDoMes == 11)
            System.out.println("NOVEMBRO");

        else if (numeroDoMes == 12)
            System.out.println("DEZEMBRO");

        else
            System.out.println("Número inválido!\n");

        if (numeroDoMes == 7 || numeroDoMes == 12 || numeroDoMes == 1)
            System.out.println("FÉRIAS!\n");
        leia.close();
    }
}