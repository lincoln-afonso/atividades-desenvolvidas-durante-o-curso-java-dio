package lista;

public class Lista {
    private No primeirNo;
    private No ultimoNo;
    private int tamanho;

    public Lista() {
        this.setPrimeirNo(null);
        this.setUltimoNo(null);
        this.setTamanho(0);
    }

    public No getPrimeirNo() {
        return this.primeirNo;
    }

    public void setPrimeirNo(No primeirNo) {
        this.primeirNo = primeirNo;
    }

    public No getUltimoNo() {
        return this.ultimoNo;
    }

    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    private int getTamanho() {
        return this.tamanho;
    }

    private void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEmpty() {
        return this.getTamanho() == 0 ? true : false;
    }

    public int size() {
        return this.getTamanho();
    }

    private boolean validaIndice(int indice) {
        if (indice < 0 || indice >= this.getTamanho())
            return false;
        return true;
    }

    private No getNo(int indice) {
        if (this.validaIndice(indice) == false)
            throw new IndexOutOfBoundsException("Indice inválido!\n");

        if (indice == 0)
            return this.getPrimeirNo();
        else if (indice == this.getTamanho() - 1)
            return this.getUltimoNo();
        else {
            No noAuxiliar = this.getPrimeirNo();

            for (int i = 0; i < indice; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            return noAuxiliar;
        }
    }

    public Object get(int indice) {
        return this.getNo(indice).getConteudo();
    }

    /**
     * <h1>add</h1> <br>
     * Este metodo adiciona novos itens na lista colocando-os na 1ª posição.
     * 
     * @param conteudo
     */
    public void add(Object conteudo) {
        No novoNo = new No(conteudo);

        if (this.getTamanho() == 0) {
            this.setPrimeirNo(novoNo);
            this.setUltimoNo(novoNo);
            novoNo.setProximoNo(this.getPrimeirNo());
            this.tamanho++;
            return;
        }

        novoNo.setProximoNo(this.getPrimeirNo());
        this.setPrimeirNo(novoNo);
        this.getUltimoNo().setProximoNo(novoNo);

        this.tamanho++;
    }

    public No remove(int indice) {
        No noAuxiliar = this.getNo(indice);
        if (indice == 0) {
            if (this.getTamanho() == 1) {
                this.getPrimeirNo().setProximoNo(null);
                this.setPrimeirNo(null);
                this.setUltimoNo(null);

            } else {
                this.getPrimeirNo().setProximoNo(null);
                System.out.println(noAuxiliar.getProximoNo());

            }
            this.tamanho--;
            return noAuxiliar;
        } else if (indice == 1) {

        }
        this.tamanho--;
        return noAuxiliar;

    }

    public String toString() {
        String str = "";
        No noAuxiliar;
        if (this.isEmpty()) {
            str = "[]";
        } else {
            noAuxiliar = this.getPrimeirNo();
            for (int i = 0; i < this.getTamanho() + 6; i++) {
                str += "[no{conteudo: " + noAuxiliar.getConteudo() + "}]---> ";
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            str += "(primeiro no [no{conteudo:" + noAuxiliar.getConteudo() + "}]";
        }

        return str;
    }

    public void exibirLista() {
        if (this.isEmpty() == false) {
            No noAuxiliar = this.getPrimeirNo();
            for (int i = 0; i < this.getTamanho() + 1; i++) {
                System.out.println("conteudo: " + noAuxiliar.getConteudo());
                System.out.println("proximo no: " + noAuxiliar.getProximoNo().getConteudo() + "\n");
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            System.out.println(">" + this.getPrimeirNo().getConteudo());
            System.out.println(">" + this.getUltimoNo().getConteudo() + "\n");
        } else
            System.out.println("Lista vazia!\n");
    }
}