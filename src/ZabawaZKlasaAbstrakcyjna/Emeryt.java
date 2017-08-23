package ZabawaZKlasaAbstrakcyjna;


public abstract class Emeryt {

    public static final int ILOSC_OCZODOLOW = 2 ;                     //stała
    public abstract void krzyczNaDzieci();                     //metoda abstrakcyjna – wdrażamy w kl dziedz

    abstract void walczOMiejsceWAutobusie();

    public void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double)odleglosc/predkosc;
        System.out.println("Biegne po kiełbase bede za "+czas);
    }

}