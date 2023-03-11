package vetor;

import java.util.Scanner;

/*
 * Sua organização acaba de contratar um estagiário para trabalhar no Suporte de
 * Informática, com a intenção de fazer um levantamento nas sucatas encontradas
 * nesta área. A primeira tarefa dele é testar todos os cerca de 200 mouses que
 * se encontram lá, testando e anotando o estado de cada um deles, para
 * verificar o que se pode aproveitar deles. Foi requisitado que você desenvolva
 * um programa para registrar este levantamento. O programa deverá receber um
 * número indeterminado de entradas, cada uma contendo: um número de
 * identificação do mouse o tipo de defeito: necessita da esfera; necessita de
 * limpeza; a.necessita troca do cabo ou conector; a.quebrado ou inutilizado Uma
 * identificação igual a zero encerra o programa
 */

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final int QTDE_MOUSE = 6;
        final int QTDE_SITUACAO = 4;
        int[] situacao = new int[QTDE_SITUACAO];
        int opcao;
        boolean valido;
        String[] situacoes = { "1 - necessita de esfera", "2 - necessita de limpeza",
                "3 - necessita torca docabo ou conector", "4 - quebrado ou inutilizado" };

        for (int i = 0; i < QTDE_MOUSE; i++) {
            valido = true;
            do {
                Exercicio22.exibirOpcoes();
                System.out.print("Informe a opção que corresponde a situação do mouse: ");
                opcao = leia.nextInt();
                switch (opcao) {
                case 1:
                    situacao[0]++;
                    break;

                case 2:
                    situacao[1]++;
                    break;

                case 3:
                    situacao[2]++;
                    break;

                case 4:
                    situacao[3]++;
                    break;

                default:
                    System.out.println("Opção inválida!\n");
                    valido = false;
                    break;
                }
            } while (valido == false);
        }

        System.out.println("Situação \t\t\tQuantidade \tPercentual");
        for (int i = 0; i < QTDE_MOUSE; i++) {
            System.out.println(situacoes[i] + "\t\t" + situacao[i] + "\t\t"
                    + Exercicio22.calcularPercentualSituacao(situacao[i], QTDE_MOUSE) + "%");
        }
        System.out.println("\n\n");
        leia.close();
    }

    public static void exibirOpcoes() {
        System.out.println("1 - necessita de esfera");
        System.out.println("2 - necessita de limpeza");
        System.out.println("3 - necessita troca do cabo ou conector");
        System.out.println("4 - quebrado ou inutilizado\n");
    }

    public static float calcularPercentualSituacao(int qtdeTotalSituacao, int qtdeTotalMouse) {
        return qtdeTotalSituacao * 100 / qtdeTotalMouse;
    }
}