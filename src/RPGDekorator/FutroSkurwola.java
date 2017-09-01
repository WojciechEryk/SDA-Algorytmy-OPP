package RPGDekorator;

public class FutroSkurwola extends TarczaDekorator {

    private Tarcza _tarcza;

    public FutroSkurwola(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + ", z zewtnątrz przybite futro ze Skurwola";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 30;
    }
}
