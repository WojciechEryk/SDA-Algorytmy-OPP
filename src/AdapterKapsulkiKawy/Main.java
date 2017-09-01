package AdapterKapsulkiKawy;


import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        KawaIDolceGusto dg = new KawaIDolceGusto();
        KawaIDolceGusto dg2 = new KawaIDolceGusto();
        KawaTassimo kt = new KawaTassimo();
        KawaTassimo kt2 = new KawaTassimo();
        AdapterDolceGustoToTassimo adapterB = new AdapterDolceGustoToTassimo(dg);
        AdapterTassimoToIDolceGusto adapterT = new AdapterTassimoToIDolceGusto(kt2);



        ArrayList<Tassimo> list= new ArrayList<>();
        list.add(adapterB);
        list.add(kt);

        ArrayList<IDolceGusto> list2= new ArrayList<>();
        list2.add(adapterT);
        list2.add(dg2);

        for (IDolceGusto IDolceGusto :list2) {
            IDolceGusto.PysznaKawaOdNescafe();
        }

        System.out.println("\n--------------------------\n");

        for (Tassimo tassimo :list) {
            tassimo.pysznaKawkaOdBosha();
        }

    }
}
