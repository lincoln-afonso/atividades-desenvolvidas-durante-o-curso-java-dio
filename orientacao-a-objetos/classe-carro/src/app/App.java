package app;

public class App {
    public static void main(String[] args) throws Exception {
        Carro c = new Carro("prata", "urbano", 240);
        /*
         * c.setCapacidadeTanque(240); c.setCor("prata"); c.setModelo("Urbano");
         */

        System.out.println("Cor: " + c.getCor());
        System.out.println("Modleo: " + c.getModelo());
        System.out.println("Capacidae do tanque: " + c.getCapacidadeTanque());
        System.out.println("Valor gasto para encher o tanque: R$ " + c.calcularValorTotalTanque(4.30));

    }
}