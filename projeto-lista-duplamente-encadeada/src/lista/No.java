package lista;

public class No {
    private Object conteudo;
    private No proximoNo;
    private No noAnterior;

    public No(Object conteudo) {
        this.setConteudo(conteudo);
        this.setNoAnterior(null);
        this.setProximoNo(null);
    }

    public Object getConteudo() {
        return this.conteudo;
    }

    private void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No getNoAnterior() {
        return this.noAnterior;
    }

    public void setNoAnterior(No noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        String str = "";

        str = "[no{conteudo:" + this.getConteudo() + "}] ";
        return str;
    }
}