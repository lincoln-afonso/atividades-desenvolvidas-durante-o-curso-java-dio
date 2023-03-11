package pilha;

public class Pilha {
    private No noEntrada;

    private No getNoEntrada() {
        return this.noEntrada;
    }

    public void setNoEntrada(No no) {
        this.noEntrada = no;
    }

    public boolean isEmpty() {
        if (this.getNoEntrada() == null)
            return true;
        return false;
    }

    public void push(No no) {
        if (this.isEmpty()) {
            this.setNoEntrada(no);
        } else {
            no.setProximoNo(this.getNoEntrada());
            this.setNoEntrada(no);
        }
    }

    public No pop() {
        if (!this.isEmpty()) {
            No poped;
            poped = this.getNoEntrada();
            this.setNoEntrada(this.getNoEntrada().getProximoNo());
            return poped;
        }
        return null;
    }

    public No top() {
        return this.getNoEntrada();
    }

    public String toString() {
        String string = "";
        No no;

        no = this.getNoEntrada();
        while (no != null) {
            string += "{" + no.toString() + "}\n";
            no = no.getProximoNo();
        }

        string += "\n";
        return string;
    }

}