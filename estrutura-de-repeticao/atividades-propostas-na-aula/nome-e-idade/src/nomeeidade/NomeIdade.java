package nomeeidade;

import java.util.Scanner;

/* Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */
public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        do {
            System.out.print("Informe o nome: ");
            nome = leia.nextLine();

            if (nome.equals("0") == false) {
                do {
                    System.out.print("Informe a idade: ");
                    idade = leia.nextInt();

                    if (idade < 0)
                        System.out.println("Idade inválida, tente novamente!\n");

                    leia.nextLine(); // limpando o buffer
                } while (idade < 0);
            }

        } while (nome.equals("0") == false);

        System.out.println("Programa encerrado!\n");
        leia.close();
    }
}
