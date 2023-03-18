package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void exibirCoresArcoIris(Set<String> cores) {
        Iterator<String> cor = cores.iterator();
        while (cor.hasNext()) {
            System.out.println(cor.next());
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Set<String> cores = new HashSet<>();

        cores.add("azul");
        cores.add("vermelho");
        cores.add("amarelo");
        cores.add("branco");
        cores.add("verde");
        cores.add("roxo");
        cores.add("lilas");

        System.out.println("Cores do arco íris");
        App.exibirCoresArcoIris(cores);
        System.out.println("Quantidade de cores do arco íris: " + cores.size());

        Set<String> cores2 = new TreeSet<>();
        cores2.add("azul");
        cores2.add("vermelho");
        cores2.add("amarelo");
        cores2.add("branco");
        cores2.add("verde");
        cores2.add("roxo");
        cores2.add("lilas");

        System.out.println("\nCores em ordem alfabética");
        App.exibirCoresArcoIris(cores2);

        String[] coresArcoIris = { "azul", "vermelho", "amarelo", "branco", "verde", "roxo", "lilas" };
        Set<String> conjunto = new LinkedHashSet<>(Arrays.asList(coresArcoIris));
        App.exibirCoresArcoIris(conjunto);

        List<String> lista = new ArrayList<>(conjunto);
        Collections.reverse(lista);
        System.out.println("Cores na ordem inversa");
        App.exibirCoresArcoIris(cores);

        System.out.println("Cores que começam com 'v'");
        for (String cor : cores2) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("\nRemovendo cores que não começam com 'v'");
        Iterator<String> iterator = cores2.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v"))
                iterator.remove();
        }

        System.out.println("\nCores restantes");
        App.exibirCoresArcoIris(cores2);

        cores2.clear();
        System.out.println("\nConjunto vazio? " + cores2.isEmpty());
    }
}