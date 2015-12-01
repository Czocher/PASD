package pasd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pokój {

    private int piętro;
    private int numer;
    private int pojemność;
    private List<Gość> goście;

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
        return goście.remove(g);
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.piętro;
        hash = 31 * hash + this.numer;
        hash = 31 * hash + this.pojemność;
        hash = 31 * hash + Objects.hashCode(this.goście);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokój other = (Pokój) obj;
        if (this.piętro != other.piętro) {
            return false;
        }
        if (this.numer != other.numer) {
            return false;
        }
        if (this.pojemność != other.pojemność) {
            return false;
        }
        if (!Objects.equals(this.goście, other.goście)) {
            return false;
        }
        return true;
    }
    
    

}
