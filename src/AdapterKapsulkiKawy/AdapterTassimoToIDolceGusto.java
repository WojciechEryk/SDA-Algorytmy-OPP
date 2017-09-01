package AdapterKapsulkiKawy;


public class AdapterTassimoToIDolceGusto implements IDolceGusto {
    Tassimo _tassimo;

    public AdapterTassimoToIDolceGusto(Tassimo tassimo) {
       _tassimo = tassimo;
    }

    @Override
    public void PysznaKawaOdNescafe() {
        _tassimo.pysznaKawkaOdBosha();
    }
}
