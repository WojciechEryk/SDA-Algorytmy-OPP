package RPGDekorator;

public class DuzyPlecak extends Plecak {

    public DuzyPlecak() {
        this.opis="Duzy Plecak";
    }

    @Override
    public double pojemnosc() {
        return 30;
    }
}
