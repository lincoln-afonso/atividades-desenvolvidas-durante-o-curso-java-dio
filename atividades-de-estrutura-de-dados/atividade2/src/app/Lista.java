package app;

public class Lista {
    private int tamanho;
    private No primeiroNo;
    private No ultimoNo;

    public Lista() {
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int getTamanho() {
        return tamanho;
    }

    private No getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public boolean isEmpty() {
        if (this.getPrimeiroNo() == null)
            return true;
        return false;
    }

    public int size() {
        return this.getTamanho();
    }

    public void add(String nome) {
        No novoNo = new No(nome);

        if (this.isEmpty()) {
            this.setPrimeiroNo(novoNo);
            this.setUltimoNo(novoNo);
        } else {
            this.getUltimoNo().setProximoNo(novoNo);
            novoNo.setNoAnterior(this.getUltimoNo());
            this.setUltimoNo(novoNo);
            novoNo.setProximoNo(this.getPrimeiroNo());
        }
        this.tamanho++;
    }

    public String toString() {
        String str = "";
        No noAuxiliar = this.getPrimeiroNo();

        if (this.isEmpty())
            return "[ ]";

        for (int i = 0; i < this.getTamanho(); i++) {
            str += "[no{jogador: " + noAuxiliar.getNome() + "}]";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return str;
    }

}