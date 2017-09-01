package RPGDekorator;

public class JadSkurwola extends MieczDekorator {
    protected Miecz _miecz;

    public JadSkurwola(Miecz miecz) {
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " nasączony jadem skurwola, który jest tak silny, że ja pierdole";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 20;
    }
}
