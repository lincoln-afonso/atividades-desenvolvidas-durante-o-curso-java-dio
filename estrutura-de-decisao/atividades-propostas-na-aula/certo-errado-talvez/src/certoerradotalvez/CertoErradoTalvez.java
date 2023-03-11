package certoerradotalvez;

import java.util.Scanner;

public class CertoErradoTalvez {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");
        numero = leia.nextInt();

        switch (numero) {
        case 1:
        case 2:
        case 3:
            System.out.println("CERTO");
            break;
        case 4:
            System.out.println("ERRADO");
            break;
        case 5:
            System.out.println("TALVEZ");
            break;
        default:
            System.out.println("Inválido!");
            break;
        }
    }
}