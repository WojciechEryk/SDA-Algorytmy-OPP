package ZabawyZInterfejsem;


public class Main {
    public static void main(String[] args) {

        ICzteroKolowy samochod1 = new Samochod();
        samochod1.jedzNaCzolowke();

        IDwuKolowy motocykl = new Motocykl();
        motocykl.przewrocSie();
    }

}
