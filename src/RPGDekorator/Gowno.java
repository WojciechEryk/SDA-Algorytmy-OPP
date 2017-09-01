package RPGDekorator;

public class Gowno extends MieczDekorator {
    protected Miecz _miecz;

    public Gowno(Miecz miecz) {
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " natarty gównem";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 5;
    }
}
