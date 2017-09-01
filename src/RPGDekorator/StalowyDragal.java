package RPGDekorator;

public class StalowyDragal extends Miecz{
    public StalowyDragal() {
        this.opis = "Stalowy Drągal";
    }

    @Override
    public double atak() {
        return 10;
    }
}
