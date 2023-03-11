package app;

public class Carro {
    private String cor;
    private String modelo;
    private float capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double calcularValorTotalTanque(double valorCombustivel) {
        if (valorCombustivel > 0) {
            return valorCombustivel * capacidadeTanque;
        }
        throw new IllegalArgumentException("Erro: o valor informado é inválido!");
    }
}