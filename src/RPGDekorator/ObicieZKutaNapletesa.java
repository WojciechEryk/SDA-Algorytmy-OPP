package RPGDekorator;

public class ObicieZKutaNapletesa extends TarczaDekorator {
    private Tarcza _tarcza;

    public ObicieZKutaNapletesa(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + ", niezniszczalne obicie z Kutanapletesa";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona()+10;
    }
}
