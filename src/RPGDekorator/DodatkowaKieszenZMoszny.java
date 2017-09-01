package RPGDekorator;

public class DodatkowaKieszenZMoszny extends PlecakDekorator {
    private Plecak _plecak;

    public DodatkowaKieszenZMoszny(Plecak plecak) {
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + ", z dodatkową kieszenią wykonaną z moszny";
    }

    @Override
    public double pojemnosc() {
        return _plecak.pojemnosc() + 10;
    }
}
