package AdapterKapsulkiKawy;


public class AdapterDolceGustoToTassimo implements Tassimo {

    private IDolceGusto _I_dolceGusto;

    public AdapterDolceGustoToTassimo(IDolceGusto IDolceGusto) {
        _I_dolceGusto = IDolceGusto;
    }

    @Override
    public void pysznaKawkaOdBosha() {
       _I_dolceGusto.PysznaKawaOdNescafe();
    }
}
