package pilha;

//import pilha.No;

public class Main {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));

        // System.out.println(pilha.toString());

        for (int i = 0; i < 5; i++)
            System.out.println(pilha.pop());
        // System.out.println(pilha.toString());

    }
}