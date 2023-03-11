package app;

public class No {
    private String nome;
    private No proximoNo;
    private No noAnterior;

    public No(String nome) {
        this.nome = nome;
        this.proximoNo = null;
        this.noAnterior = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "[no{jogador:" + this.getNome() + "}]";
    }

}