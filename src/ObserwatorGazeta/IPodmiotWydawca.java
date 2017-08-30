package ObserwatorGazeta;


public interface IPodmiotWydawca {
    void dodajPrenumeratora(IOdbiorcaObserwator prenumerator);
    void usunPrenumeratora(IOdbiorcaObserwator prenumerator);
    void wyslijNowyNumer();
}
