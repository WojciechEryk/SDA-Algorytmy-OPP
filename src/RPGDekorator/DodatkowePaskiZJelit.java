package RPGDekorator;

public class DodatkowePaskiZJelit extends PlecakDekorator {
    private Plecak _plecak;

    public DodatkowePaskiZJelit(Plecak plecak) {
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + ", z dodatkowymi paskami wykonanych z jelit wrogow";
    }

    @Override
    public double pojemnosc() {
        return _plecak.pojemnosc() + 15;
    }
}
