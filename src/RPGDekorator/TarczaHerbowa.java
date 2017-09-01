package RPGDekorator;

public class TarczaHerbowa extends Tarcza {

    public TarczaHerbowa() {
        this.opis = "Tarcza herbowa";
    }

    @Override
    public double obrona() {
        return 5;
    }
}
