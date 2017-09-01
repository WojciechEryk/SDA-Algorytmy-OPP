package RPGDekorator;

public class NaszywkaNocnegoKochanka extends PlecakDekorator {
    private Plecak _plecak;

    public NaszywkaNocnegoKochanka(Plecak plecak) {
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + ", z naszywką Nocnego Kochanka";
    }

    @Override
    public double pojemnosc() {
        return _plecak.pojemnosc() + 1;
    }
}
