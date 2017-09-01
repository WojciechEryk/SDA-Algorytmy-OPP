package RPGDekorator;


public abstract class Tarcza {
    protected String opis;

    public String pobierzOpis(){
        return opis;
    }
    public abstract double obrona();
}
