package lista;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        lista.add("agua");
        lista.add("cerveja");
        lista.add("refrigerante");
        lista.remove(0);
        System.out.println(lista.remove(0));
        System.out.println(lista);
    }

}