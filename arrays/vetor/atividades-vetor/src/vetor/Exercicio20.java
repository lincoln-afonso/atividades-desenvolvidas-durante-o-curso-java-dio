package vetor;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Double;

/* 
 * As Organizações Tabajara resolveram dar um abono aos seus colaboradores em 
 * reconhecimento ao bom resultado alcançado durante o ano que passou. Para isto 
 * contratou você para desenvolver a aplicação que servirá como uma projeção de quanto será 
 * gasto com o pagamento deste abono.
 * Após reuniões envolvendo a diretoria executiva, a diretoria financeira e os 
 * representantes do sindicato laboral, chegou-se a seguinte forma de cálculo: 
 * 
 * a.Cada funcionário receberá o equivalente a 20% do seu salário bruto de dezembro; 
 * a.O piso do abono será de 100 reais, isto é, aqueles funcionários cujo salário for muito baixo, 
 * recebem este valor mínimo; Neste momento, não se deve ter nenhuma preocupação com colaboradores 
 * com tempo menor de casa, descontos, impostos ou outras particularidades. Seu programa 
 * deverá permitir a digitação do salário de um número indefinido (desconhecido) de salários. 
 * Um valor de salário igual a 0 (zero) encerra a digitação. Após a entrada de todos os dados 
 * o programa deverá calcular o valor do abono concedido a cada colaborador, de acordo com a regra 
 * definida acima. Ao final, o programa deverá apresentar:
    O salário de cada funcionário, juntamente com o valor do abono;
    O número total de funcionário processados;
    O valor total a ser gasto com o pagamento do abono;
    O número de funcionário que receberá o valor mínimo de 100 reais;
    O maior valor pago como abono; A tela abaixo é um exemplo de execução do programa, apenas para 
    fins ilustrativos. Os valores podem mudar a cada execução do programa. 
 */

public class Exercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        ArrayList<Double> salarioList = new ArrayList<Double>();
        double somaAbono = 0;
        double salario;
        int qtdeValorMinimo = 0;
        double maiorAbono = 0;
        double abono;

        do {
            do {
                System.out.print("Salário: ");
                salario = leia.nextDouble();
                if (salario < 0)
                    System.out.println("Salário inválido!\n");
            } while (salario < 0);
            if (salario != 0) {
                salarioList.add(salario);
            }
            System.out.println();
        } while (salario != 0);

        if (salarioList.size() > 0) {
            System.out.println("Salário  -  Abono");
            for (double valorSalario : salarioList) {
                abono = valorSalario * 0.2;
                if (abono <= 100) {
                    abono = 100;
                    qtdeValorMinimo++;
                }
                System.out.println("R$ " + valorSalario + " - " + abono);

                if (abono > maiorAbono)
                    maiorAbono = abono;
                somaAbono += abono;
            }
            System.out.println("\nForam processados " + salarioList.size() + " colaboradores");
            System.out.println("Total gasto com abonos: R$ " + somaAbono);
            System.out.println("Valor mínimo pago a " + qtdeValorMinimo + " colaboradores");
            System.out.println("Maior valor de abono pago: R$ " + maiorAbono + "\n\n");
        }
        leia.close();
    }
}
