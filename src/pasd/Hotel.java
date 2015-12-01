package pasd;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Pokój> pokoje;

    public Hotel() {
        pokoje = new ArrayList<>();
    }

    boolean zakwateruj(Gość g) {
        for (Pokój pokój : pokoje) {
            if (pokój.zakwateruj(g)) {
                return true;
            }
        }
        return false;
    }

    boolean wyrzuć(Gość g) {
        for (Pokój pokój : pokoje) {
            if (pokój.getGoście().remove(g)) {
                return true;
            }
        }
        return false;
    }
    
    void dodajPokój(Pokój p) {
        pokoje.add(p);
    }
    
    void usuńPokój(Pokój p) {
        pokoje.remove(p);
    }

    public List<Pokój> getPokoje() {
        return pokoje;
    }

    public void setPokoje(List<Pokój> pokoje) {
        this.pokoje = pokoje;
    }

}
