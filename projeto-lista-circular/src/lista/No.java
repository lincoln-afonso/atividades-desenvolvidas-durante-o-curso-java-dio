package lista;

public class No {
    Object conteudo;
    No proximoNo;

    public No(Object conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public Object getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        String str = "";

        str = "{conteudo:" + this.getConteudo() + "}";
        return str;
    }

}