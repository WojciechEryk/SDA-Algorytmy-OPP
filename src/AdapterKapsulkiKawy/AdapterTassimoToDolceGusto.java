package AdapterKapsulkiKawy;


public class AdapterTassimoToDolceGusto implements DolceGusto{
    Tassimo _tassimo;

    public AdapterTassimoToDolceGusto(Tassimo tassimo) {
       _tassimo = tassimo;
    }

    @Override
    public void PysznaKawaOdNescafe() {
        _tassimo.pysznaKawkaOdBosha();
    }
}
