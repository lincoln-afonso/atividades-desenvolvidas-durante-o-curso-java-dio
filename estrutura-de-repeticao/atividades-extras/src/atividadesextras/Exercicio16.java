package atividadesextras;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdeTermos;
        int termo = 0;
        int proximoTermo = 0;
        int contador = 0;

        do {
            System.out.print("Informe a quantidade de termos que deseja gerar: ");
            qtdeTermos = leia.nextInt();

            if (qtdeTermos < 1)
                System.out.println("Informe um número válido de termos!\n");
        } while (qtdeTermos < 1);

        while (contador < qtdeTermos) {

        }
        leia.close();
    }

}