package KawiarniaDekorator;

public class MocnoPalona extends Napoj {
    @Override
    public double koszt() {
        return 0.99;
    }

    public MocnoPalona() {
        this.opis = "Mocno palona";
    }
}
