package ZabawyZInterfejsem;


public class Motocykl implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jadę motocyklem");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje motocyklem");
    }

    @Override
    public void przewrocSie() {
        System.out.printf("Przewracam się z motocykla");
    }

    public void dodajGazu(){
        System.out.printf("Dodaje gazu");
    }
}
