package SymulatorKaczki;


public class KaczkaModel extends Kaczka{
    public KaczkaModel() {
        kwakanie = new NieKwacz();
        latanie = new LatamBoMamSkrzydla();
    }

    @Override
    public void Wyswietl(){
        System.out.println("Kaczka model sie pojawila!");
    }
}
