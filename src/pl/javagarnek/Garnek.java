package pl.javagarnek;

public class Garnek {

    /*Pola klasy*/
    int srednica;
    int wysokosc;
    String kolor;

    public Garnek(){        // konstruktor bezargumentowy
    }

    public Garnek(int srednica, int wysokosc){  // konstruktor dwuargumentowy - przeciażanie konstruktorów
        this.srednica = srednica;
        this.wysokosc = wysokosc;

    }

    public Garnek(int srednica, int wysokosc, String kolor){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;

    }

    public String gotuj(){
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol){       //przeciążanie metod
        if (czyDodalismySol) {
            return "Gotowanie z solą";
        }else {
            return "Gotowanie bez soli";
        }
    }

    public int zwrocTemperatureWrzeniaWody(){
        return 100;
    }
}
