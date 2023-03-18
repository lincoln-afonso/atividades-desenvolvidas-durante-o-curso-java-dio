package app;

import java.util.Comparator;

public class ComparatoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }

}