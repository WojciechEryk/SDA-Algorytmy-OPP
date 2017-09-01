package RPGDekorator;

public class RunaPeknietegoSlonca extends MieczDekorator {
    protected Miecz _miecz;

    public RunaPeknietegoSlonca(Miecz miecz) {
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " z runą pęknietego słońca";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 20;
    }
}
