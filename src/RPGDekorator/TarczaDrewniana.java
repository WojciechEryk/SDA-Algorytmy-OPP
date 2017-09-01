package RPGDekorator;

public class TarczaDrewniana extends Tarcza {

    public TarczaDrewniana() {
        this.opis = "Drewniana tarcza";
    }

    @Override
    public double obrona() {
        return 1;
    }
}
