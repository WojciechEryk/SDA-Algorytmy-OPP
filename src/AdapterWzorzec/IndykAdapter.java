package AdapterWzorzec;


public class IndykAdapter implements IKaczka {

    private IIndyk _indyk;

    public IndykAdapter(IIndyk indyk) {
        _indyk = indyk;
    }

    @Override
    public void kwacz() {
        _indyk.gulgucze();
    }

    @Override
    public void lataj() {
        _indyk.lata();
    }
}
