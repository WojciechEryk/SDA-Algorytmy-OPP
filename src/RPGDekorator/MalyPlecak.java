package RPGDekorator;

public class MalyPlecak extends Plecak {
    public MalyPlecak() {
        this.opis = "Maly Plecak";
    }

    @Override
    public double pojemnosc() {
        return 20;
    }
}
