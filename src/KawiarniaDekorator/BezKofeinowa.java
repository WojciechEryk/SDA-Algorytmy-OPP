package KawiarniaDekorator;


public class BezKofeinowa extends Napoj{

    @Override
    public double koszt() {
        return 5;
    }

    @Override
    public void UstawOpis(String opis) {
        this.opis="Bez kofeiny";
    }
}
