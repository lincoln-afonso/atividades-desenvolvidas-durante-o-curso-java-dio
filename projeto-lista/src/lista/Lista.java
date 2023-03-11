package lista;

public class Lista {
    private No referenciaNoEntrada;

    public Lista() {
        this.setReferenciaNoEntrada(null);
    }

    public No getReferenciaNoEntrada() {
        return this.referenciaNoEntrada;
    }

    public void setReferenciaNoEntrada(No referenciaNoEntrada) {
        this.referenciaNoEntrada = referenciaNoEntrada;
    }

    public boolean isEmpty() {
        if (this.getReferenciaNoEntrada() == null)
            return true;
        return false;
    }

    public int size() {
        int tamanho = 0;
        No no;
        no = this.referenciaNoEntrada;

        while (no != null) {
            tamanho++;
            no = no.getReferenciaProximoNo();
        }
        return tamanho;
    }

    public void add(Object conteudo) {
        No novoNo = new No(conteudo);
        No noAuxiliar = this.getReferenciaNoEntrada();

        if (this.getReferenciaNoEntrada() == null) {
            this.setReferenciaNoEntrada(novoNo);
            return;
        }

        for (int i = 0; i < this.size() - 1; i++)
            noAuxiliar = noAuxiliar.getReferenciaProximoNo();

        /*
         * while (true) { if (noAuxiliar.getReferenciaProximoNo() != null) noAuxiliar =
         * noAuxiliar.getReferenciaProximoNo(); else break; }
         */
        noAuxiliar.setReferenciaProximoNo(novoNo);
    }

    private No getNo(int index) {
        No no;

        this.validaIndice(index);

        no = this.getReferenciaNoEntrada();
        for (int i = 0; i < index; i++) {
            no = no.getReferenciaProximoNo();
        }
        return no;
    }

    private void validaIndice(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException(
                    "Indice inválido. Informe um indice que vá de 0 até " + (this.size() - 1) + "!\n");
        }
    }

    public Object get(int index) {
        Object conteudo;
        No no;

        no = this.getNo(index);
        conteudo = no.getConteudo();
        return conteudo;
    }

    public Object remove(int index) {
        No no;
        No noAnterior;

        if (index == 0) {
            no = this.getNo(index);
            this.setReferenciaNoEntrada(no.getReferenciaProximoNo());
        } else {
            no = this.getNo(index);
            noAnterior = this.getNo(index - 1);
            noAnterior.setReferenciaProximoNo(no.getReferenciaProximoNo());
        }

        return no;
    }

    @Override
    public String toString() {
        String str = "";
        No noAuxiliar = this.getReferenciaNoEntrada();

        for (int i = 0; i < this.size(); i++) {
            str += "[no{conteudo: " + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getReferenciaProximoNo();
        }
        return str += "null";
    }
}