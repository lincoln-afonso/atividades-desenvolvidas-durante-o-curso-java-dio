package app;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * Crie uma classe LinguagemFavorita que possua os atributos nome,anoDeCriacao e ide.
 * Em seguida,crie um conjunto com 3 linguagens e faça um programa que ordene esse 
 * conjunto por:
 * Ordem de Inserção
 * Ordem Natural(nome)
 * IDE
 * Ano de criação e nome
 * Nome,ano de criacao e IDE
 * Ao final,exiba as linguagens no console,um abaixo da outra.
 */

public class App {
    private static Scanner leia = new Scanner(System.in);

    public static void cadastrarLinguagens(Set<LinguagemFavorita> linguagensFavoritas) {
        String nome;
        String ide;
        Integer anoDeCriacao;

        for (int i = 0; i < 3; i++) {
            LinguagemFavorita lf = new LinguagemFavorita();

            System.out.print("Nome: ");
            nome = App.leia.nextLine();
            lf.setNome(nome);

            System.out.print("Ide: ");
            ide = App.leia.nextLine();
            lf.setIde(ide);

            System.out.print("Ano de criação: ");
            anoDeCriacao = App.leia.nextInt();
            lf.setAnoDeCriacao(anoDeCriacao);

            System.out.println();
            App.leia.nextLine();
            linguagensFavoritas.add(lf);
        }
    }

    public static void main(String[] args) throws Exception {
        Set<LinguagemFavorita> linguagensFavoritas = new HashSet<>();

        linguagensFavoritas.add(new LinguagemFavorita("Ruby", "wode blocks", 1981));
        linguagensFavoritas.add(new LinguagemFavorita("zava", "vs code", 1992));
        linguagensFavoritas.add(new LinguagemFavorita("CSS", "at studio", 2000));
        linguagensFavoritas.add(new LinguagemFavorita("bph", "at studio", 2000));
        linguagensFavoritas.add(new LinguagemFavorita("Net", "sublime", 2000));
        linguagensFavoritas.add(new LinguagemFavorita("Ada", "texty", 1890));
        System.out.println(linguagensFavoritas);

        System.out.println("Ordem aleatória");
        System.out.println(linguagensFavoritas);

        Set<LinguagemFavorita> conjunto = new TreeSet<>(new ComparatoIde());
        conjunto.add(new LinguagemFavorita("Ruby", "e", 1981));
        conjunto.add(new LinguagemFavorita("zava", "a", 1992));
        conjunto.add(new LinguagemFavorita("CSS", "b", 2000));
        conjunto.add(new LinguagemFavorita("bph", "e", 2000));
        conjunto.add(new LinguagemFavorita("Net", "c", 2000));
        conjunto.add(new LinguagemFavorita("Ada", "d", 1890));

        System.out.println("Ordem alfabética por nome da Ide");
        System.out.println(conjunto);

        Set<LinguagemFavorita> elemento = new TreeSet<>(new ComparatoNome());
        elemento.add(new LinguagemFavorita("Ruby", "e", 1981));
        elemento.add(new LinguagemFavorita("zava", "a", 1992));
        elemento.add(new LinguagemFavorita("CSS", "b", 2000));
        elemento.add(new LinguagemFavorita("csh", "e", 2000));
        elemento.add(new LinguagemFavorita("Net", "c", 2000));
        elemento.add(new LinguagemFavorita("Ada", "d", 1890));

        System.out.println("Ordem alfabética por nome da Linguagem de programação");
        System.out.println(elemento);

        Set<LinguagemFavorita> elemento2 = new TreeSet<>(new ComparatoNomeIdeAnoCriacao());
        elemento2.add(new LinguagemFavorita("Ruby", "e", 1981));
        elemento2.add(new LinguagemFavorita("zava", "a", 1992));
        elemento2.add(new LinguagemFavorita("CSS", "b", 2000));
        elemento2.add(new LinguagemFavorita("csh", "e", 2000));
        elemento2.add(new LinguagemFavorita("ada", "c", 2000));
        elemento2.add(new LinguagemFavorita("Ada", "c", 1890));

        System.out.println("Ordem por nome da linguagem");
        System.out.println(elemento2);
        leia.close();
    }
}