package lista;

public class No {
    private Object conteudo;
    private No referenciaProximoNo;

    public No(Object conteudo) {
        this.referenciaProximoNo = null;
        this.setConteudo(conteudo);
    }

    public Object getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    public No getReferenciaProximoNo() {
        return this.referenciaProximoNo;
    }

    public void setReferenciaProximoNo(No referenciaProximoNo) {
        this.referenciaProximoNo = referenciaProximoNo;
    }

    @Override
    public String toString() {
        String str = "";
        str += "[no{conteudo: }" + this.getConteudo() + "}]";
        return str;
    }
}