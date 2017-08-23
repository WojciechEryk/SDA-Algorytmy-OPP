package ZabawyZInterfejsem;


public class Rower implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jadę rowerem");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuję rowerem");
    }

    @Override
    public void przewrocSie() {
        System.out.printf("Wywyracam");
    }
}
