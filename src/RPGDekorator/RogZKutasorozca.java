package RPGDekorator;

public class RogZKutasorozca extends TarczaDekorator {
    private Tarcza _tarcza;

    public RogZKutasorozca(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + ", z rogiem Kurasorożca";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 10;
    }
}
