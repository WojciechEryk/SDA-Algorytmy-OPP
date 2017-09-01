package RPGDekorator;

public class SztywnaSmierc extends Miecz{

    public SztywnaSmierc() {
        this.opis = "Sztywna Smierc";
    }

    @Override
    public double atak() {
        return 15;
    }
}
