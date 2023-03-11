package app;

import java.io.IOException;
import java.util.Scanner;

public class DIO {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    double media = 0;
    double x;
    double soma = 0;

    // TODO: Implemente as condições adequadas para obter a quantidade
    // de valores positivos e a média dos valores positivos:
    for (int i = 0; i < 6; i++) {
      System.out.print((i + 1) + "° número: ");
      x = leitor.nextDouble();
      if (x > 0) {
        cont++;
        soma += x;
      }
    }

    if (soma != 0)
      media = soma / cont;
    System.out.println(cont + " valores positivos");
    System.out.println(String.format("%.1f", media));
    leitor.close();
  }

}