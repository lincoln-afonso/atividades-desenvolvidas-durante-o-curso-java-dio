package app;

import java.lang.Comparable;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private String ide;
    private Integer anoDeCriacao;

    public LinguagemFavorita(String nome, String ide, Integer anoDeCriacao) {
        this.setNome(nome);
        this.setIde(ide);
        this.setAnoDeCriacao(anoDeCriacao);
    }

    public LinguagemFavorita() {
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the ide
     */
    public String getIde() {
        return ide;
    }

    /**
     * @param ide the ide to set
     */
    public void setIde(String ide) {
        this.ide = ide;
    }

    /**
     * @return Integer return the anoDeCriacao
     */
    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    /**
     * @param anoDeCriacao the anoDeCriacao to set
     */
    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    @Override
    public int compareTo(LinguagemFavorita lf) {
        int compare = this.getNome().compareToIgnoreCase(lf.getNome());

        return compare;
    }

    @Override
    public String toString() {
        return this.getNome() + "  " + this.getIde() + "  " + this.getAnoDeCriacao() + "\n";
    }
}