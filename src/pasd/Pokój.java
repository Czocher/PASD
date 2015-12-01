package pasd;

import java.util.ArrayList;
import java.util.List;

public class Pokój {

    int piętro;
    int numer;
    int pojemność;
    List<Gość> goście;

    public Pokój() {
        goście = new ArrayList<>();
    }

    boolean zakwateruj(Gość g) {
        if (goście.size() <= pojemność) {
            goście.add(g);
            return true;
        }
        return false;
    }

    boolean wyrzuć(Gość g) {
        if (goście.indexOf(g) != -1) {
            return false;
        }
        goście.remove(g);
        return true;
    }

    public int getPiętro() {
        return piętro;
    }

    public void setPiętro(int piętro) {
        this.piętro = piętro;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getPojemność() {
        return pojemność;
    }

    public void setPojemność(int pojemność) {
        this.pojemność = pojemność;
    }

    public List<Gość> getGoście() {
        return goście;
    }

    public void setGoście(List<Gość> goście) {
        this.goście = goście;
    }

}
