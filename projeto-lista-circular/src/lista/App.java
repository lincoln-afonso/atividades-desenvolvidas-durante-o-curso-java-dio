package lista;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        try {
            lista.add("Lincoln");
            lista.add("Afonso");
            lista.add("Avila");
            // No no = lista.remove(0);
            // System.out.println(no);
            System.out.println(lista);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}