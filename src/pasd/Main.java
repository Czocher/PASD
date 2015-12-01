package pasd;

import java.util.Date;


public class Main {


    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        
        Pokój p1 = new Pokój();
        p1.setPojemność(1);
        
        Pokój p2 = new Pokój();
        p2.setPojemność(2);
        
        hotel.dodajPokój(p1);
        hotel.dodajPokój(p2);
        
        Gość g1 = new Gość("Paweł", "Czochański", new Date(1991, 7, 2), "Polska");
        Gość g2 = new Gość("JarJar", "Binks", new Date(2500, 11, 2), "Galaktyczne Imperium");
        Gość g3 = new Gość("Adam", "Skobodziński", new Date(1980, 2, 13), "Polska");
        
        System.out.println(hotel.zakwateruj(g3));
        System.out.println(hotel.zakwateruj(g1));
        System.out.println(hotel.zakwateruj(g2));
        System.out.println(hotel.getPokoje().get(0));
        System.out.println(hotel.getPokoje().get(1));
        System.out.println(hotel.znajdźNajstarszegoGościa());
        
    }

}
