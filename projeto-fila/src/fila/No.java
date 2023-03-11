package fila;

public class No {
    private Object objeto;
    private No referenciaProximoNo;

    public No(Object objeto) {
        this.setObjeto(objeto);
    }

    public Object getObjeto() {
        return this.objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getReferenciaProximoNo() {
        return this.referenciaProximoNo;
    }

    public void setReferenciaProximoNo(No referenciaProximoNo) {
        this.referenciaProximoNo = referenciaProximoNo;
    }

    public String toString() {
        return "{objeto:" + this.getObjeto() + "}";
    }
}