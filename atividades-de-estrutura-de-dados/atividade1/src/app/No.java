package app;

public class No {
    private int chave;
    private No proximoNo;
    private String informacao;

    public No() {
    }

    public No(int chave, String informacao) {
        this.chave = chave;
        this.proximoNo = null;
        this.informacao = informacao;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public Object getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    @Override
    public String toString() {
        return "[no{informacao: " + this.getInformacao() + "}]";
    }
}