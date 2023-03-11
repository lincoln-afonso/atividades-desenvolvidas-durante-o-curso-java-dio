package app;

public class Lista {
    private No primeiroNo;
    private No ultimoNo;
    private int tamanho;

    public Lista() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public No getPrimeiroNo() {
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

    public int getTamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        if (this.getPrimeiroNo() == null)
            return true;
        return false;
    }

    public int size() {
        return this.getTamanho();
    }

    private void validaIndice(int indice) {
        if (indice < 0 || indice >= this.getTamanho())
            throw new IndexOutOfBoundsException("Erro: A lista apresenta " + this.getTamanho() + " elemento(s).");
    }

    private No get(int indice) {
        No noAuxiliar = this.getPrimeiroNo();

        this.validaIndice(indice);
        for (int i = 0; i < indice; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    /**
     * <h1>public No getNo(int )</h1></br>
     * Verifica a existência de um elemento com uma determinada chave em uma lista
     * ordenada.
     * 
     * @param chave
     * @return retorna o nó correspondente a chave informada ou null caso não tenha
     *         correpondência.
     */
    public No getNo(int chave) {
        No noAuxiliar = this.getPrimeiroNo();

        while (noAuxiliar != null) {
            if (chave == noAuxiliar.getChave())
                return noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return null;
    }

    /**
     * <h1>public No getNo(String )</h1></br>
     * Verifica a existência de um elemento com uma determinada informação/dado em
     * uma lista ordenada.
     * 
     * @param informacao
     * @return retorna o nó correspondente a informação procurada ou null caso não
     *         tenha correpondência.
     */
    public No getNo(String informacao) {
        No noAuxiliar = this.getPrimeiroNo();

        while (noAuxiliar != null) {
            if (noAuxiliar.getInformacao().equals(informacao))
                return noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return null;
    }

    /**
     * <h1>public void remove(int )</h1> </br>
     * </br>
     * Remove um elemento de uma lista em uma dada posição.
     * 
     * @param indice
     */
    public void remove(int indice) {
        No no;

        no = this.get(indice);
        if (indice == 0) {
            if (this.getTamanho() == 1) {
                this.setPrimeiroNo(null);
                this.setUltimoNo(null);
            } else {
                this.setPrimeiroNo(no.getProximoNo());
                no.setProximoNo(null);
            }
        } else {
            No noAuxiliar = this.getPrimeiroNo();
            No noAnterior = noAuxiliar;

            for (int i = 0; i < indice; i++) {
                noAnterior = noAuxiliar;
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            if (noAuxiliar.getProximoNo() == null) {
                noAnterior.setProximoNo(null);
                this.setUltimoNo(noAnterior);
            } else {
                noAnterior.setProximoNo(noAuxiliar.getProximoNo());
                noAuxiliar.setProximoNo(null);
            }
        }
        this.tamanho--;
    }

    /**
     * <h1>public void remove(String )</h1> </br>
     * </br>
     * Remove um elemento de uma lista como uma determinada informação.
     * 
     * @param informacao
     */
    public void remove(String informacao) {
        // No noAuxiliar = this.getPrimeiroNo();
        // No noAnterior = noAuxiliar;

    }

    /**
     * <h1>public void add(Object , int)</h1></br>
     * Insere um elemento em uma lista em uma dada posição.
     * 
     * @param chave
     * @param indice
     */
    public void add(int chave, int indice, String informacao) {
        No novoNo = new No(chave, informacao);

        if (indice == 0) {
            if (this.isEmpty()) {
                this.setPrimeiroNo(novoNo);
                this.setUltimoNo(novoNo);
            } else if (indice == 0) {
                novoNo.setProximoNo(this.getPrimeiroNo());
                this.setPrimeiroNo(novoNo);
            }

        } else if (indice == this.getTamanho() - 1) {
            No ultimoNo = this.getPrimeiroNo();
            No noAnterior = ultimoNo;

            this.validaIndice(indice);
            while (ultimoNo.getProximoNo() != null) {
                noAnterior = ultimoNo;
                ultimoNo = ultimoNo.getProximoNo();
            }
            novoNo.setProximoNo(ultimoNo);
            noAnterior.setProximoNo(novoNo);
        } else {
            No noAuxiliar = this.getPrimeiroNo();
            No noAnterior = noAuxiliar;

            this.validaIndice(indice);
            for (int i = 0; i < indice; i++) {
                noAnterior = noAuxiliar;
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            novoNo.setProximoNo(noAuxiliar);
            noAnterior.setProximoNo(novoNo);
            System.out.println(this.getUltimoNo());
        }

        this.tamanho++;
    }

    /**
     * 
     * Dada uma lista com um número qualquer de elementos, encontra o menor elemento
     * da lista e o move para o começo da lista.
     */
    public void moveMenorElemento() {
        No noAuxiliar = this.getPrimeiroNo();
        No noAnterior = noAuxiliar;
        No menorElemento = noAuxiliar;

        if (this.isEmpty())
            throw new IllegalArgumentException("Erro: Lista vazia!");

        if (this.getTamanho() > 1) {
            while (noAuxiliar.getProximoNo() != null) {
                if (noAuxiliar.getProximoNo().getChave() < menorElemento.getChave()) {
                    noAnterior = noAuxiliar;
                    menorElemento = noAuxiliar.getProximoNo();
                }
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            if (this.getPrimeiroNo() != menorElemento) {
                if (this.getUltimoNo() == menorElemento) {
                    this.setUltimoNo(noAnterior);
                    noAnterior.setProximoNo(null);
                } else {
                    noAnterior.setProximoNo(menorElemento.getProximoNo());
                }
                menorElemento.setProximoNo(this.getPrimeiroNo());
                this.setPrimeiroNo(menorElemento);
            }
        }
    }

    @Override
    public String toString() {
        String str = "";

        if (this.isEmpty())
            return "[ ]";

        No no = this.getPrimeiroNo();
        while (no != null) {
            str += "[no{chave:" + no.getChave() + " informacao:" + no.getInformacao() + "}] ---> ";
            no = no.getProximoNo();
        }
        str += "null";
        return str;
    }

}