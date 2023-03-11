package atividadesextras;

import java.util.Scanner;
/*
 * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99
 * e agora possui uma loja de conveniências. Faça um programa que implemente 
 * uma caixa registradora rudimentar. O programa deverá receber um
 * número desconhecido de valores referentes aos preços das mercadorias. Um valor 
 * zero deve ser informado pelo operador para indicar o final da compra. 
 * O programa deve então mostrar o total da compra e perguntar o valor em
 * dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
 * Após esta operação, o programa deverá voltar ao ponto inicial, para registrar
 * a próxima compra.
 */

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorProduto;
        double somaValor = 0;
        double dinheiro;
        int cont = 1;

        System.out.println("Lojas Tabajára");
        do {
            System.out.print("Produto " + cont + ": R$ ");
            valorProduto = leia.nextDouble();
            somaValor += valorProduto;
            cont++;
        } while (valorProduto > 0);

        if (somaValor > 0) {
            System.out.println("Total: R$ " + somaValor);
            do {
                System.out.print("Dinheiro: R$ ");
                dinheiro = leia.nextDouble();
            } while (dinheiro < somaValor);
            System.out.println("Troco: R$ " + (dinheiro - somaValor));
        }
    }
}