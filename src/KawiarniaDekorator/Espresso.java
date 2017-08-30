package KawiarniaDekorator;


public class Espresso extends Napoj{
    @Override
    public double koszt() {
        return 1.99;
    }


    public Espresso() {
         this.opis = "Espresso";
    }
}
