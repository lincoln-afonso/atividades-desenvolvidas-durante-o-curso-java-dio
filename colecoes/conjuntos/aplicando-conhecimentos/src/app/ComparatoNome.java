package app;

import java.util.Comparator;

public class ComparatoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }

}