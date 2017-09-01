package AdapterKapsulkiKawy;


import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        KawaDolceGusto dg = new KawaDolceGusto();
        KawaDolceGusto dg2 = new KawaDolceGusto();
        KawaTassimo kt = new KawaTassimo();
        KawaTassimo kt2 = new KawaTassimo();
        AdapterDolceGustoToTassimo adapterB = new AdapterDolceGustoToTassimo(dg);
        AdapterTassimoToDolceGusto adapterT = new AdapterTassimoToDolceGusto(kt2);



        ArrayList<Tassimo> list= new ArrayList<>();
        list.add(adapterB);
        list.add(kt);

        ArrayList<DolceGusto> list2= new ArrayList<>();
        list2.add(adapterT);
        list2.add(dg2);

        for (DolceGusto dolceGusto :list2) {
            dolceGusto.PysznaKawaOdNescafe();
        }

        System.out.println("\n--------------------------\n");

        for (Tassimo tassimo :list) {
            tassimo.pysznaKawkaOdBosha();
        }

    }
}
