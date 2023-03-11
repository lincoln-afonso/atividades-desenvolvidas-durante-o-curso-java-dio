package atividadesextras;

import java.util.Scanner;

/* Faça um programa que leia um nome de usuário e a sua senha e não aceite
 * a senha igual ao nome do usuário,
 * mostrando uma mensagem de erro e voltando a pedir as informações.
 */
public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        String nome;
        String senha;

        do {
            do {
                System.out.print("Informe o nome: ");
                nome = leia.nextLine();
            } while (nome.isEmpty());

            do {
                System.out.print("Informe a senha: ");
                senha = leia.nextLine();
            } while (senha.isEmpty());

            if (senha.equals(nome))
                System.out.println("Erro: nome e senha não podem ser iguais!\n");
        } while (senha.equals(nome));

        leia.close();
    }
}