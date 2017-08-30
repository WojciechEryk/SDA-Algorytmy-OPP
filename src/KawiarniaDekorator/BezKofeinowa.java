package KawiarniaDekorator;


public class BezKofeinowa extends Napoj{

    @Override
    public double koszt() {
        return 1.05;
    }

    public BezKofeinowa() {
        this.opis="Bez kofeiny";
    }
}
