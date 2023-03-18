package app;

import java.util.Comparator;

public class ComparatoNomeIdeAnoCriacao implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        if (nome != 0)
            return nome;

        int ide = lf1.getIde().compareToIgnoreCase(lf2.getIde());
        if (ide != 0)
            return ide;

        return Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
    }
}