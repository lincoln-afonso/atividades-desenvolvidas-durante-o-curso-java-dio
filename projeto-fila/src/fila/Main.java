package fila;

public class Main {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.enqueue("Dodora");
        fila.enqueue("Lincoln");
        fila.enqueue("Tetenti");
        fila.enqueue("Spike");
        fila.enqueue("Jaera");
        fila.enqueue("Bidu");

        fila.dequeue();
        // System.out.println(fila.dequeue());

        System.out.println(fila);
    }
}