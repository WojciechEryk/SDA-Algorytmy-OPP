package ObserwatorGazeta;


import java.util.ArrayList;

public class KaczorDonald implements IPodmiotWydawca {
    private ArrayList<IOdbiorcaObserwator> _odbiorcy;
    private String _numer;

    public KaczorDonald() {
        _odbiorcy = new ArrayList<>();
    }

    @Override
    public void dodajPrenumeratora(IOdbiorcaObserwator prenumerator) {
        _odbiorcy.add(prenumerator);
    }

    @Override
    public void usunPrenumeratora(IOdbiorcaObserwator prenumerator) {
        _odbiorcy.remove(prenumerator);
    }

    @Override
    public void wyslijNowyNumer() {
        for (IOdbiorcaObserwator odbiorca :_odbiorcy) {
            odbiorca.odbierzGazete(_numer);
        }
    }

    public void wydajNumer(String numer){
        _numer = numer;
        wyslijNowyNumer();
    }
}
