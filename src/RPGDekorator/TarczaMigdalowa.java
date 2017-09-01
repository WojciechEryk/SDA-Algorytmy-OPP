package RPGDekorator;

public class TarczaMigdalowa extends Tarcza {

    public TarczaMigdalowa() {
        this.opis = "Tarcza migdałowa";
    }

    @Override
    public double obrona() {
        return 15;
    }
}
