package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Utilizando listas, faça um programa que faça 5 perguntas para uma
 * pessoa sobre um crime. As perguntas são:

 *   "Telefonou para a vítima?"

 *   "Esteve no local do crime?"

 *   "Mora perto da vítima?"

 *   "Devia para a vítima?"

 *   "Já trabalhou com a vítima?"

 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
 * "Assassina". Caso contrário, ela será classificado como "Inocente".
 */

public class App {
    public static void inicializarLista(List<String> perguntasList) {
        perguntasList.add("Telefonou para a vítima?");
        perguntasList.add("Esteve no local do crime?");
        perguntasList.add("Mora perto da vítima?");
        perguntasList.add("Devia para a vítima?");
        perguntasList.add("Já trabalhou para a vítima?");
    }

    public static void main(String[] args) throws Exception {
        List<String> perguntasList = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int quantRespostasPositivas = 0;
        String resposta;

        App.inicializarLista(perguntasList);
        for (String pergunta : perguntasList) {
            do {
                System.out.print(pergunta + " ");
                resposta = leia.nextLine();
            } while (resposta.equalsIgnoreCase("nao") == false && resposta.equalsIgnoreCase("sim") == false);

            if (resposta.equalsIgnoreCase("sim"))
                quantRespostasPositivas++;
        }

        if (quantRespostasPositivas >= 2) {
            if (quantRespostasPositivas == 2)
                System.out.println("\nSuspeita");
            else if (quantRespostasPositivas <= 4)
                System.out.println("Cúmplice");
            else
                System.out.println("Culpado");
        }
        leia.close();
    }
}