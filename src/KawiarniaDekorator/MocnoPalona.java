package KawiarniaDekorator;

public class MocnoPalona extends Napoj {
    @Override
    public double koszt() {
        return 9.99;
    }


    @Override
    public void UstawOpis(String opis) {
        this.opis = "Mocno palona";
    }
}
