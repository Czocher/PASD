package pasd;

import java.util.Date;
import java.util.Objects;

public class Gość {

    private String imię;
    private String nazwisko;
    private Date dataUrodzenia;
    private String kraj;

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.imię);
        hash = 67 * hash + Objects.hashCode(this.nazwisko);
        hash = 67 * hash + Objects.hashCode(this.dataUrodzenia);
        hash = 67 * hash + Objects.hashCode(this.kraj);
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
        final Gość other = (Gość) obj;
        if (!Objects.equals(this.imię, other.imię)) {
            return false;
        }
        if (!Objects.equals(this.nazwisko, other.nazwisko)) {
            return false;
        }
        if (!Objects.equals(this.dataUrodzenia, other.dataUrodzenia)) {
            return false;
        }
        if (!Objects.equals(this.kraj, other.kraj)) {
            return false;
        }
        return true;
    }
    
    
}
