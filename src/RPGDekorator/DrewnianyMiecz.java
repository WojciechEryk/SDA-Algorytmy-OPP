package RPGDekorator;

public class DrewnianyMiecz extends Miecz {

    public DrewnianyMiecz() {
        this.opis = "Drewniany Miecz";
    }

    @Override
    public double atak() {
        return 1;
    }
}
