package ZabawaZKlasaAbstrakcyjna;



public class Dziadek extends Emeryt{
    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Za moich czasów...!\n");
    }

    @Override
    void walczOMiejsceWAutobusie() {
        System.out.printf("Wali laską po nogach\n");
    }
    public void zapalPapierosa(){
        System.out.printf("Palę szluga\n");
    }

    @Override
    public void upieczSzarlotka() {
        System.out.printf("Szarlotka z prądem");
    }
}
