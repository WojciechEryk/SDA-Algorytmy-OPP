package KawiarniaDekorator;


public class StarCafeSpecial extends Napoj {
    @Override
    public double koszt() {
        return 18.30;
    }

    @Override
    public String UstawOpis(String opis) {
        return "Espresso";
    }
}
