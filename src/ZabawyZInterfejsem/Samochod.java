package ZabawyZInterfejsem;


public class Samochod implements ICzteroKolowy {

    @Override
    public void jedz() {
        System.out.printf("Jadę sammochodem");
    }
    @Override
    public void hamuj() {
        System.out.printf("Jadę!\n");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.printf("Jadę na czołówkę");
    }
}
