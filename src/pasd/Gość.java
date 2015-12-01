package pasd;

import java.util.Date;


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
}
