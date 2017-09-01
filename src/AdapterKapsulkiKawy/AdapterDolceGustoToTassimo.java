package AdapterKapsulkiKawy;


public class AdapterDolceGustoToTassimo implements Tassimo {

    private DolceGusto _dolceGusto;

    public AdapterDolceGustoToTassimo(DolceGusto dolceGusto) {
        _dolceGusto = dolceGusto;
    }

    @Override
    public void pysznaKawkaOdBosha() {
       _dolceGusto.PysznaKawaOdNescafe();
    }
}
