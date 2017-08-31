package AdapterWzorzec;


public class KaczkaAdapter implements IIndyk {
    private IKaczka _kaczka;

    public KaczkaAdapter(IKaczka kaczka) {
        _kaczka = kaczka;
    }

    @Override
    public void gulgucze() {
        _kaczka.kwacz();
    }

    @Override
    public void lata() {
        _kaczka.lataj();
    }
}
