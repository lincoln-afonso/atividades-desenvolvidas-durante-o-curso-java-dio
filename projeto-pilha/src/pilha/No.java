package pilha;

public class No {
    private int dado;
    private No proximoNo;

    public No(int dado) {
        this.setDado(dado);
    }

    public int getDado() {
        return this.dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No no) {
        this.proximoNo = no;
    }

    @Override
    public String toString() {
        return "{dado:" + this.dado + "}";
    }
}