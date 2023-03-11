package fila;

public class Fila {
    No referenciaNoEntrada;

    public Fila() {
    }

    public No getReferenciaNoEntrada() {
        return this.referenciaNoEntrada;
    }

    public void setReferenciaNoEntrada(No referenciaNoEntrada) {
        this.referenciaNoEntrada = referenciaNoEntrada;
    }

    public boolean isEmpty() {
        if (this.referenciaNoEntrada == null)
            return true;
        return false;
    }

    public void enqueue(Object objeto) {
        No novoNo = new No(objeto);

        if (this.isEmpty())
            this.setReferenciaNoEntrada(novoNo);
        else {
            novoNo.setReferenciaProximoNo(this.getReferenciaNoEntrada());
            this.setReferenciaNoEntrada(novoNo);
        }
    }

    public Object dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = this.getReferenciaNoEntrada();
            No noAuxiliar = this.getReferenciaNoEntrada();

            if (this.getReferenciaNoEntrada().getReferenciaProximoNo() == null)
                this.setReferenciaNoEntrada(null);
            else {
                while (primeiroNo.getReferenciaProximoNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaProximoNo();
                }
                noAuxiliar.setReferenciaProximoNo(null);
            }
            return primeiroNo;
        }
        return null;
    }

    public Object first() {
        if (!this.isEmpty()) {
            No primeiroNo;
            primeiroNo = this.getReferenciaNoEntrada();
            while (true) {
                if (primeiroNo.getReferenciaProximoNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaProximoNo();
                } else
                    return primeiroNo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String string;

        string = "[";
        if (!this.isEmpty()) {
            No no;
            no = this.getReferenciaNoEntrada();
            while (true) {
                if (no != null)
                    string += "{objeto:" + no.getObjeto().toString() + "} -->";
                else
                    break;
                no = no.getReferenciaProximoNo();
            }
            string += "]";
            return string;
        }
        return "null";
    }
}