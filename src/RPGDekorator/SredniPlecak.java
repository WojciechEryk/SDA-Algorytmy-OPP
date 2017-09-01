package RPGDekorator;

public class SredniPlecak extends Plecak {

    public SredniPlecak() {
        this.opis = "Sredni Plecak";
    }

    @Override
    public double pojemnosc() {
        return 20;
    }
}
