package lista;

public class Lista {
    private No primeiroNo;
    private No ultimoNo;
    private int tamanho;

    public Lista() {
        this.setPrimeiroNo(null);
        this.setUltimoNo(null);
        this.tamanho = 0;
    }

    private No getPrimeiroNo() {
        return this.primeiroNo;
    }

    private void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    private No getUltimoNo() {
        return this.ultimoNo;
    }

    private void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    private int getTamanho() {
        return tamanho;
    }

    public int size() {
        return this.getTamanho();
    }

    public boolean isEmpty() {
        if (this.getTamanho() == 0)
            return true;
        return false;
    }

    private boolean validaIndice(int indice) {
        if (indice < 0 || indice >= this.getTamanho())
            return false;
        return true;
    }

    private No getNo(int indice) {
        No noAuxiliar;

        if (this.validaIndice(indice) == false)
            throw new IndexOutOfBoundsException("Erro: A lista apresenta " + this.getTamanho() + " elemento(s)!\n");

        if (indice == this.getTamanho() - 1)
            return this.getUltimoNo();

        noAuxiliar = this.getPrimeiroNo();
        for (int i = 0; i < indice; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public Object get(int indice) {
        No no;

        no = this.getNo(indice);
        return no.getConteudo();
    }

    public void add(Object conteudo) {
        No novoNo = new No(conteudo);

        if (this.getTamanho() == 0) {
            this.setPrimeiroNo(novoNo);
            this.setUltimoNo(novoNo);
            this.tamanho++;
            return;
        }

        this.getUltimoNo().setProximoNo(novoNo);
        novoNo.setNoAnterior(this.getUltimoNo());
        this.setUltimoNo(novoNo);

        this.tamanho++;

    }

    public void add(int indice, Object conteudo) {
        No noAuxiliar;
        No novoNo = new No(conteudo);

        if (indice == 0) {
            if (this.getPrimeiroNo() == null) {
                this.setPrimeiroNo(novoNo);
                this.setUltimoNo(novoNo);
            } else {
                novoNo.setProximoNo(this.getPrimeiroNo());
                this.getPrimeiroNo().setNoAnterior(novoNo);
                this.setPrimeiroNo(novoNo);
            }
        } else if (indice == this.getTamanho() - 1) {
            novoNo.setProximoNo(this.getUltimoNo());
            novoNo.setNoAnterior(this.getUltimoNo().getNoAnterior());
            this.getUltimoNo().getNoAnterior().setProximoNo(novoNo);
            this.getUltimoNo().setNoAnterior(novoNo);
        } else {
            noAuxiliar = this.getNo(indice);
            novoNo.setProximoNo(noAuxiliar);
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            noAuxiliar.getNoAnterior().setProximoNo(novoNo);
            noAuxiliar.setNoAnterior(novoNo);
        }

        /*
         * if (this.getTamanho() == 0) { this.setPrimeiroNo(novoNo);
         * this.setUltimoNo(novoNo);
         * 
         * } else if (this.getTamanho() == 1) {
         * novoNo.setProximoNo(this.getPrimeiroNo());
         * this.getPrimeiroNo().setNoAnterior(novoNo); this.setPrimeiroNo(novoNo);
         * 
         * } else if (this.getTamanho() - 1 == indice) {
         * novoNo.setProximoNo(this.getUltimoNo());
         * novoNo.setNoAnterior(this.getUltimoNo().getNoAnterior());
         * this.getUltimoNo().getNoAnterior().setProximoNo(novoNo);
         * this.getUltimoNo().setNoAnterior(novoNo);
         * 
         * } else { noAuxiliar = this.getNo(indice); novoNo.setProximoNo(noAuxiliar);
         * novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
         * noAuxiliar.getNoAnterior().setProximoNo(novoNo);
         * noAuxiliar.setNoAnterior(novoNo); }
         */
        this.tamanho++;
    }

    public Object remove(int indice) {
        System.out.println(indice + "\n");
        No no = this.getNo(indice);

        if (indice == 0) {
            if (no.getProximoNo() == null) {
                this.setPrimeiroNo(null);
                this.setUltimoNo(null);
            } else {
                this.setPrimeiroNo(no.getProximoNo());
                this.getPrimeiroNo().setNoAnterior(null);
            }

        } else if (indice == this.getTamanho() - 1) {
            no.getNoAnterior().setProximoNo(null);
            this.setUltimoNo(no.getNoAnterior());
            no.setNoAnterior(null);

        } else {
            no.getNoAnterior().setProximoNo(no.getProximoNo());
            no.getProximoNo().setNoAnterior(no.getNoAnterior());
            no.setNoAnterior(null);
            no.setProximoNo(null);
        }
        this.tamanho--;
        return no;
    }

    @Override
    public String toString() {
        String str = "[";
        No no = this.getPrimeiroNo();

        if (no == null)
            return "null";
        for (int i = 0; i < this.getTamanho(); i++) {
            str += "no{conteudo:" + no.getConteudo() + "}--> ";
            no = no.getProximoNo();
        }
        return str += "null]";
    }

    /*
     * public void exibirLista() { if (this.getPrimeiroNo() == null) {
     * System.out.println("null"); return; } No no = this.getPrimeiroNo(); for (int
     * i = 0; i < this.getTamanho(); i++) { System.out.println("No anterior: " +
     * no.getNoAnterior()); System.out.println("Conteudo: " + no.getConteudo());
     * System.out.println("No posterior: " + no.getProximoNo() + "\n"); no =
     * no.getProximoNo(); } }
     */
}