package KawiarniaDekorator;


public class Espresso extends Napoj{
    @Override
    public double koszt() {
        return 18.30;
    }

    @Override
    public void UstawOpis(String opis) {
         this.opis = "Espresso";
    }
}
