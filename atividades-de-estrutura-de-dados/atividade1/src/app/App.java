package app;

/* Resolva as questões abaixo:
 * a) Implemente uma função para inserir um elemento em uma lista em uma dada
 * posição.
 * 
 * b) Implemente uma função para excluir um elemento de uma lista em uma dada
 * posição.
 * 
 * c) Implemente uma função para verificar a existência de um elemento com uma
 * determinada chave em uma lista. Retornar um ponteiro para tal nodo
 * ou NULL.
 * 
 * d) Escreva uma função que, dada uma lista com um número qualquer de elementos,
 * encontre o elemento com a menor chave da lista e o move para o começo da lista.
 * 
 * e) Implemente uma função que retorne um nó da lista que corresponda a uma 
 * determinada informação.
 * 
 * Obs.: Implemente outros metodos que julgar necessário e para aprendizado!
*/
public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        try {
            lista.add(5, 0, "Lincoln");
            lista.add(8, 0, "Afonso");
            lista.add(4, 1, "Maria");

            lista.ordena();
            // System.out.println(lista.getNo(8));
            // System.out.println(lista.getNo("Maria"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(lista);
    }
}