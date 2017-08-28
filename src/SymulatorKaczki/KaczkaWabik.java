package SymulatorKaczki;


public class KaczkaWabik extends Kaczka{
    public KaczkaWabik() {
        latanie = new NieLatam();
        kwakanie = new NieKwacz();
    }

    public void Wyswietl(){
        System.out.println("Wyglada jak kaczka wabik");
    }
}
