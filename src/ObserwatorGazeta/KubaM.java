package ObserwatorGazeta;


public class KubaM implements IOdbiorcaObserwator {

    private IPodmiotWydawca _gazeta;

    public KubaM(IPodmiotWydawca gazeta) {
        zaprenumerujGazete(gazeta);
    }


    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Hurra! Jest nowy numer %s gazety!", numer);
    }

    public void rezygnujZGazety(){
        _gazeta.usunPrenumeratora(this);
    }

    public void zaprenumerujGazete(IPodmiotWydawca gazeta){
        _gazeta=gazeta;
        _gazeta.dodajPrenumeratora(this);
    }
}
