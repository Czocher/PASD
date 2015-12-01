package pasd;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    
    private int numer = 0;

    private List<Pokój> pokoje;

    public Hotel() {
        pokoje = new ArrayList<>();
    }

    public boolean zakwateruj(Gość g) {
        for (Pokój pokój : pokoje) {
            if (pokój.zakwateruj(g)) {
                return true;
            }
        }
        return false;
    }

    public boolean wyrzuć(Gość g) {
        for (Pokój pokój : pokoje) {
            if (pokój.getGoście().remove(g)) {
                return true;
            }
        }
        return false;
    }
    
    public Pokój znajdźNajstarszegoGościa() {
        Pokój pokójZNajstarszym = null;
        for (Pokój pokój : pokoje) {
            if(pokójZNajstarszym == null || pokójZNajstarszym.znajdźNajstarszegoGościa().getDataUrodzenia().after(pokój.znajdźNajstarszegoGościa().getDataUrodzenia())) {
                pokójZNajstarszym = pokój;
            }
        }
        
        return pokójZNajstarszym;
    }
    
    public void dodajPokój(Pokój p) {
        pokoje.add(p);
        p.setNumer(numer++);
    }
    
    public void usuńPokój(Pokój p) {
        pokoje.remove(p);
    }

    public List<Pokój> getPokoje() {
        return pokoje;
    }

    public void setPokoje(List<Pokój> pokoje) {
        this.pokoje = pokoje;
    }

}
