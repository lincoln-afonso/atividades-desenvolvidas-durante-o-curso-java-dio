package atividadesextras;

import java.util.Scanner;

/* Faça um programa que leia e valide as seguintes informações:
 * a. Nome: maior que 3 caracteres;
 * b. Idade: entre 0 e 150;
 * c. Salário: maior que zero;
 * d. Sexo: 'f' ou 'm';
 * e. Estado Civil: 's', 'c', 'v', 'd'; 
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;
        float salario;
        char sexo;
        char estadoCivil;
        boolean estadoCivilValido;

        do {
            System.out.print("Nome: ");
            nome = leia.nextLine();

            if (nome.length() < 3)
                System.out.println("Nome inválido!\n");
        } while (nome.length() < 3);

        do {
            System.out.print("Idade: ");
            idade = leia.nextInt();

            if (idade < 0 || idade > 150)
                System.out.println("Idade inválida!\n");
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Informe o salário: ");
            salario = leia.nextFloat();

            if (salario <= 0)
                System.out.println("Salário inválido!\n");
        } while (salario <= 0);

        do {
            System.out.print("Informe f para feminino ou m para masculino: ");
            sexo = leia.next().charAt(0);

            if (sexo != 'f' && sexo != 'm')
                System.out.println("Sexo inválido!\n");
        } while (sexo != 'f' && sexo != 'm');

        do {
            estadoCivilValido = true;
            System.out.print("Informe s para solteiro(a), c para casado(a), v para viuvo(a) ou d para divorciado(a): ");
            estadoCivil = leia.next().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Sexo inválido!\n");
                estadoCivilValido = false;
            }
        } while (estadoCivilValido == false);

        leia.close();
    }
}