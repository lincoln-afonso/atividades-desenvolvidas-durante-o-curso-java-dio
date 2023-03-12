package app;

import java.util.Scanner;

/* O Problema Josephus é um jogo de suicídio em massa que é realizado do seguinte
 * modo: n pessoas, numeradas de 1 a n, estão sentadas em uma mesa circular. Iniciando
 * da pessoa 1, um revolver contendo uma bala é passado entre elas. Após m passos, a
 * pessoa que está com a arma com a bala na agulha comete suicídio, o corpo é removido,
 * o ciclo de pessoas se fecha, e o jogo continua com a pessoa que está sentada após o
 * elemento que cometeu o suicídio. O último sobrevivente é aquele que permanecerá após
 * a morte dos demais. 
 */
public class App {
    private Scanner leia;

    public App() {
        this.leia = new Scanner(System.in);
    }

    public Scanner getLeia() {
        return this.leia;
    }

    public void cadastrarJogador(int numeroPessoas, Lista lista) {
        String nome;

        if (numeroPessoas < 2)
            throw new IllegalArgumentException("Erro: Espera-se que tenha ao menos 2 jogadores participantes");

        this.getLeia().nextLine();
        for (int i = 0; i < numeroPessoas; i++) {
            do {
                System.out.print((i + 1) + "º jogador: ");
                nome = this.getLeia().nextLine();
            } while (nome.isEmpty());
            lista.add(nome);
        }
    }

    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        Scanner leia = new Scanner(System.in);
        App app = new App();
        String ganhador;
        int numeroPessoas;
        int numeroPassos;

        System.out.println("\nProblema Josephus");
        try {
            System.out.print("Informe o número de jogadores participantes: ");
            numeroPessoas = app.getLeia().nextInt();
            app.cadastrarJogador(numeroPessoas, lista);

            System.out.print("\nInforme o número de passos: ");
            numeroPassos = app.getLeia().nextInt();

            System.out.println("\nJogadores");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("Jogador " + (i + 1) + ": " + lista.get(i));
            }
            ganhador = lista.remove(numeroPassos);
            System.out.println("\nJogador(a) vencedor(a): " + ganhador);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        leia.close();
    }
}