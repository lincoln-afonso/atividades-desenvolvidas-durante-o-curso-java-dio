package lista;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        lista.add(3, "c12");
        lista.add("c11");
        lista.add(0, "c10");

        System.out.println(lista);
    }
}