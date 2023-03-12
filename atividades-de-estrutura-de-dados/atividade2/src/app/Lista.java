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

    public String get(int indice) {
        No noAuxiliar = this.getPrimeiroNo();

        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Erro: A lista apresenta " + this.getTamanho() + "elemento(s)!\n");

        if (indice == 0)
            return this.getPrimeiroNo().getNome();
        else if (indice == this.getTamanho() - 1)
            return this.getUltimoNo().getNome();

        for (int i = 0; i < indice; i++)
            noAuxiliar = noAuxiliar.getProximoNo();

        return noAuxiliar.getNome();
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
            this.getPrimeiroNo().setNoAnterior(this.getUltimoNo());
        }
        this.tamanho++;
    }

    /**
     * Remove um jogador a cada um número determinado de passos.
     * 
     * @param numerosPassos
     * @exception IllegalArgumentException
     * @return retorna o nó/referência correspondente do jogador vencedor (uníco
     *         sobrevivente).
     */
    public String remove(int numerosPassos) {
        No noAuxiliar = this.getPrimeiroNo();
        No noAjudante = noAuxiliar;
        int contPassos;

        if (numerosPassos < 2)
            throw new IllegalArgumentException("Erro: Espera-se que o número de passos seja maior ou igual a dois!\n");

        while (this.getTamanho() > 1) {
            noAuxiliar = noAjudante;
            contPassos = 0;
            while (contPassos < numerosPassos) {
                noAuxiliar = noAuxiliar.getProximoNo();
                noAjudante = noAuxiliar.getProximoNo();
                contPassos++;
            }
            if (noAuxiliar == this.getUltimoNo()) {
                noAuxiliar.getNoAnterior().setProximoNo(this.getPrimeiroNo());
                this.getPrimeiroNo().setNoAnterior(noAuxiliar.getNoAnterior());
                this.setUltimoNo(noAuxiliar.getNoAnterior());

            } else if (noAuxiliar == this.getPrimeiroNo()) {
                this.getUltimoNo().setProximoNo(this.getPrimeiroNo().getProximoNo());
                this.getPrimeiroNo().getProximoNo().setNoAnterior(this.getUltimoNo());
                this.setPrimeiroNo(noAuxiliar.getProximoNo());
            } else {
                noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            }
            noAuxiliar.setNoAnterior(null);
            noAuxiliar.setProximoNo(null);
            this.tamanho--;
            System.out.println(noAuxiliar.getNome());
        }

        return this.getUltimoNo().getNome();
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